Patch - Write and apply
===============================
<https://www.devroom.io/2009/10/26/how-to-create-and-apply-a-patch-with-git/>

`git format-patch master --stdout > fix_empty_poster.patch`
> All **commits** that are not on master

anwenden

`git apply --stat fix_empty_poster.patch`

patch entfernbar
optional nachschauen: `git diff --patch`
`git apply -R <patch>`


---

### Un-applying a Stash
In some use case scenarios you might want to apply stashed changes, do some work, but then un-apply those changes that originally came from the stash. Git does not provide such a stash *unapply* command, but it is possible to achieve the effect by simply retrieving the patch associated with a stash and applying it in reverse:

*git stash unapply*


The closest thing I've found is git `stash --patch`. It walks you through each of the changes to working tree and index letting you choose what to stash.

$ git stash show -p stash@{0} | git apply -R
Again, if you don’t specify a stash, Git assumes the most recent stash:

$ git stash show -p | git apply -R