listing remote branches
=======================

git fetch origin

Checking out a local branch from a remote branch automatically creates what is called a “*tracking branch*” (or sometimes an “upstream branch”). Tracking branches are local branches that have a direct relationship to a remote branch. If you’re on a tracking branch and type git pull, Git automatically knows which server to fetch from and branch to merge into.