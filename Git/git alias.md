git alias
=========

```
[alias]
sshow = "!f() { git stash show stash^{/$*} -p; }; f"
sapply = "!f() { git stash apply stash^{/$*}; }; f"
```



You can then use git sapply <regex> to apply that stash (without dropping).
You can then use git sshow <regex> to show: files changed, insertions, and deletions

# new git repo alias

```
[alias]
this = !git init && git add . && git commit -m \"initial commit\"
```
