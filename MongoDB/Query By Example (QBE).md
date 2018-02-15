Query By Example (QBE)
======================

Standard von IBM entwickelt.


### withIgnorePaths kann mehrere Einträge mit Komma enthalten.
... operator in Java (spread?)
```
Example<User> example = Example.of(flynn, matching(). //
				withIgnorePaths("firstname", "lastname"));
```


```
Example<User> example = Example.of(new User("Walter", "WHITE", null), matching(). //
				withIgnorePaths("age"). //
				withMatcher("firstname", startsWith()). //
				withMatcher("lastname", ignoreCase()));
```

### Own ExampleMatcher
The Spring Data JPA query-by-example technique uses Examples and ExampleMatchers to convert entity instances into the underlying query. The current official documentation clarifies that only exact matching is available for non-string attributes. Since your requirement involves a java.util.Date field, you can only have exact matching with the query-by-example technique.

You could write your own **ExampleMatcher** that **returns query clauses** according to your needs.

#### Ziel: findAll(Example, pageable) beibehalten
wegen pageable und sorting comfort!!! 

Also eienen Examplematcher schreiben

### Idee
`public static final ExampleMatcher.StringMatcher REGEX`
Treats strings as regular expression patterns
[ExampleMatcher.StringMatcher (Spring Data Core 2.0.3.RELEASE API)](https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/domain/ExampleMatcher.StringMatcher.html)