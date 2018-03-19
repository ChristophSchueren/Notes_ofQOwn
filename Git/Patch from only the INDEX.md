Patch from only the INDEX
==========================

Index are staged files


1. stage everything for a new commit (but don't do the commit), and then:

2. **Create Patch File**
```

	git diff --cached > mypatch.patch
	
```

git diff --no-prefix <file>

> If you want to use patch you need to remove the a/ b/ prefixes that git uses by default. You can do this with the --no-prefix option (you can also do this with patch's -p option):

3. git apply mypatch.patch

4. UNAPPLY
```

	git apply -R <patch>
```
