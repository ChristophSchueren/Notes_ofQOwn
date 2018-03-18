HEAD manipulation
=================

Yes, you can do this.

`git symbolic-ref HEAD refs/heads/otherbranch`
If you need to commit on this branch, you'll want to reset the index too otherwise you'll end up committing something based on the last checked out branch.

`git reset`