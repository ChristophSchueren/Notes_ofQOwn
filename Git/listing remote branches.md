listing remote branches
=======================

`git fetch origin`

Checking out a local branch from a remote branch automatically creates what is called a “*tracking branch*” (or sometimes an “upstream branch”). Tracking branches are local branches that have a direct relationship to a remote branch. If you’re on a tracking branch and type git pull, Git automatically knows which server to fetch from and branch to merge into.

---

If you already have a local branch and want to set it to a remote branch you just pulled down, or want to change the upstream branch you’re tracking, you can use the -u or --set-upstream-to option to git branch to explicitly set it at any time.

`git branch -u origin/serverBranch`