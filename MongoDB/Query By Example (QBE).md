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