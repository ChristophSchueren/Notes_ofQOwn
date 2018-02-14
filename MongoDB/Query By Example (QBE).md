Query By Example (QBE)
======================

Standard von IBM entwickelt.


### withIgnorePaths kann mehrere Einträge mit Komma enthalten. 
```
Example<User> example = Example.of(flynn, matching(). //
				withIgnorePaths("firstname", "lastname"));
```
