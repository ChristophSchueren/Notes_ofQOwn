Query By Example (QBE)
======================

Standard von IBM entwickelt.


### withIgnorePath
```
Example<User> example = Example.of(flynn, matching(). //
				withIgnorePaths("firstname", "lastname"));
```
