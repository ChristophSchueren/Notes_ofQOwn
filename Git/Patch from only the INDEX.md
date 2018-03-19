Patch from only the INDEX
==========================

Index are staged files


1. stage everything for a new commit (but don't do the commit), and then:

2. 
```

	git diff --cached > mypatch.patch
	
```


3. git apply mypatch.patch

4. UNAPPLY
```

	git apply -R <patch>
```
