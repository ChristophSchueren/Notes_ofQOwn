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
