HttpParams
==========

HttpParams is *immutable*. 

set() creates and returns a new HttpParams instance, without mutating the instance on which set() is called. So the code should be

const params = new HttpParams().set('status', status);

let httpParams = new HttpParams().set('firstName', 'John').set('lastName', 'Doe');
this.http.get('/api/people', {params: httpParams});
=> /api/people?firstName=John&lastName=Doe


```
function toHttpParams(params) {
    return Object.getOwnPropertyNames(params)
                 .reduce((p, key) => p.set(key, params[key]), new HttpParams());
}
```


// Example:
`toHttpParams({firstName: 'John', lastName: 'Doe'});`