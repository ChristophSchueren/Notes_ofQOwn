STASH
=====
>  git stash push -m stashname is the current syntax. git stash save stashname has been deprecated

## everything
git ss "neuerName"
> stash save

## everything keeping index
```

git stash --keep-index

```

git stash save "guacamole sauce WIP"

## only staged (in index)
alias git ssi "nameofstash"
git stash push --index -m <stashname>

## only unstaged

## stash and add to other branch
git stash
git checkout other-branch
git stash pop