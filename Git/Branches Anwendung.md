Branches Anwendung
==================

### Creating a feature branch 
When starting work on a new feature, branch off from the develop branch.

$ git checkout -b myfeature develop
Switched to a new branch "myfeature"

### Release branches 
May branch off from:
develop
Must merge back into:
develop and master
Branch naming convention:
release-*