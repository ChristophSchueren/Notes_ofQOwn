Hook forbidden name in Diff
===========================
```code
# (pre-commit or pre-push)
# Fail if any matching words are present in the diff
matches=$(git diff-index --patch HEAD | grep '^+' | grep -Pi 'Word1|Word2|Word3')
 
if [ ! -z "$matches" ]
then
    cat <<\EOT
Error: Words from the blacklist were present in the diff:
EOT
    echo $matches
    exit 1  
fi
```
