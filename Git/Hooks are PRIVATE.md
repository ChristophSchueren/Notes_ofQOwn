Hooks are PRIVATE
=================

Another limitation is that client-side Git hooks aren’t checked into the repo, and thus aren’t shared amongst team members. If you want to share handy hooks with your fellow code meisters, you’ll have to dream up some distribution scheme. Some people create a directory in their repo which contains the Git hooks and is under source control. Then they create a link from `.git\hooks\*` to that folder, perhaps via a shared update script of some kind.