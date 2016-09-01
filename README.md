# Practice

Contributor: Norald Alejo  
Email: norald.alejo@gmail.com  
github HTTPS: https://github.com/Noraldeno/practice.git

This repository is for practicing git from bash. Below is a list of common git commands.

Git Commands  
~git config: Sets configuration values for user name, email and more  
~git init: Initializes a git repository  
~git clone: Makes a Git repository copy from a remote sources. Also adds original location as a remote so you can fetch from it again and push to it if you have permissions. Ex: git clone https:/github.com/Noraldeno/practice.git  
~git add: Adds file changes in your working directory to your index  
~git rm: Removes files from your index and working directory so they will not be tracked  
~git commit: Takes all of changes written in the index, creates a new commit object pointing to it and sets the branchto point to that new commit: Ex: git commit -m "Committing added changes", git commit -a-m "Committing all changes, equals to git add and git commit"  
~git status: Shows you the status of files in the index versus the working directory. It will list out files that are untracked (only in your working directory), modified (tracked but not yet updated in your index), and staged (addedto your index and ready for committing)  
~git branch: List existing branches, including remote branches if '-a' is provided. Creates a nwe branch if a branch name is provided 
~git checkout: Switches branches by updating the index, working tree, and HEAD to reflect the chosen branch  
~git merge: Merges one or more branches into your current branch and automatically creates a new commit if there is no conflict  
~git reset: Resets your index and working directory to the state of your last commit  
~git stash: Temporarily saves changes that you don't want to commit immediately  
~git tag: Tags a specific commit with a simple, human readable handle that never moves  
~git fetch: Fetches all the objects from the remote repository that are not present in the local one  
~git pull: Fetches the files from the remote repository and merges with your local one  
~git push: Pushes all the modified local objects to the remote repository and advances its branches  
  
  
  
To add an (existing) repository  
Must create a repository first from Github.com and copy URL to "remote repository URL"

-git remote add origin "remote repository URL" (without quotes)  
-git remote -v (Verifies the new remote URL)  
-git push origin master  (This pushes local to the remote repository)  
