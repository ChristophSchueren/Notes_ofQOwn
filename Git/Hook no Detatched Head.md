Hook no Detatched Head
======================

```
#!/bin/sh

if ! git symbolic-ref HEAD &> /dev/null; then
  echo "You are in a detached head state! Commit has been blocked. (Use --no-verify to bypass this check.)"
  exit 1
fi
```
