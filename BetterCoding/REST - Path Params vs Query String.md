REST -  Path Params vs Query String
====

1. Path Params vs Query String

Path params (/parent/child1;child2) are cool but query strings can express as much as path params can, are standard and explicit. ex:
/parent?id=child1&id=child2
or /parent?id=child1;child2 ...etc
2. Plural or singular

Using plurals for each collection (or table, or folder) is good since it implies that the resource is a list of other resource

/users , /users/user1, /users?active=true

Nesting resource : Default to no nesting unless there is a strong relation

If a candidate child resource can exist independently of the parent, there is no point in nesting because you might end up with multiple paths for the same thing :

/departments/{departments}/employees/{employee}
/branch-offices/{branch}/employees/{employee}
/employees/{employee}
With the latter you can do all of the rest :

all employees in a department /employees?department={department}
all employees in a branch /employees?branch={branch}
3. Use nesting only on strong relations

When the nested resource cannot exist outside the parent (Composition in UML terms for example)

/books/{book}/pages/{page} You would never look for a page without specifying a book
/players/{player}/stats} (again, it depends on your domain models)
4. Well ok... Use nested paths on not so strong relations too, but treat them as aliases

Of course you might want to do nesting even if there is no strong relation, or tied resource lifecycle (the department/employee example) for some reason (DX, readability maybe ?). if you do, maybe you should consider the nested path as being an alias only :

for /departments/{department}/employees
internal rewrite /employees?department={department}
5. If you want to HATEOAS, then path design should not be the top priority

On the other hand, client readability is not important if you want to embrace REST's HATEOAS. API clients should not guess your links or have their templates hard coded. Instead, your API provides links that the clients follow. Example:

The root path might for example list all primary links:

GET /

200 OK
Content-Type: application/json
{
   links:{
       "employees":"/url-for-employees{?department,branch,name}"
       "departments":"/them-deps"
   }
}
The links are intentionally ugly in this example. The one keyed employees is actually a URL template with optional parameters.

The client API then looks for the link with key employee , (in this case /url-for-employees) — regardless of what it looks like — and calls it:

GET /url-for-employees

200 OK
Content-Type: application/json
Link: </url-for-employees{?department,branch,name}>; rel="search",
</url-for-employees?page=2>; rel="next"

['body is an array containing the first set/page of employees']
Notice the Link header containing 2 links, one for search and one to get the next page of employees (rel=next").

Benefits of HATEOS are out of scope here but at least one is that you are free to re-organize your paths without breaking API clients

5. Last, try things on your file system

One might use the file system to sketch/mock a RESTfull API: create folders, files (and maybe symlinks/aliases/shortcuts) on your hard drive, browse them, change them, wash rinse and repeat until your happy with the structure :)

$ mkdir myapi
$ cd myapi
$ touch index.json
$ mkdir employees
$ touch employees/index.json
$ touch employees/smith.json
$ mkdir departments
$ touch departments/index.json
$ touch departments/accounting.json
$ mkdir departments/accounting
$ mkdir departments/accounting/employees
$ ln -s employees/smith.json departments/accounting/employees/smith.json
$ ls -l departments/accounting/employees
smith.json -> employees/smith.json