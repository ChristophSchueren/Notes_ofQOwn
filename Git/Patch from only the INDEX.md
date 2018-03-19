Patch from only the INDEX
==========================

Index are staged files


But sometimes it happens that part of the stuff you're doing are new files that are untracked and won't be in your git diff output. So, one way to do a patch is to stage everything for a new commit (but don't do the commit), and then:

git diff --cached > mypatch.patch