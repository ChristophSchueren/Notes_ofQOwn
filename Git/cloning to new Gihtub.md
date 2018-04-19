cloning to new Gihtub
=====================

1. Open Git Bash.

2. Create a bare clone of the repository.

git clone --bare https://github.com/exampleuser/old-repository.git
Mirror-push to the new repository.

cd old-repository.git 
**--mirror**
git push --mirror https://github.com/exampleuser/new-repository.git
Remove the temporary local repository you created in step 1.

cd ..
rm -rf old-repository.git