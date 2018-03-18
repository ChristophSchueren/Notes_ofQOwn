Git switch command alias
========================

at 23:39
add a comment
up vote
3
down vote
For the benefit of the reader:

While I think that Charles Bailey's solution is a correct one, this solution needs a tweak when switching to something, which is not a local branch. Also there should be some way how to do it with regular commands which is easy to understand. Here is what I came up with:

```
git checkout --detach
git reset --soft commitish
git checkout commitish
```

Explained:

git checkout --detach is the same as git checkout HEAD^{} which leaves the current branch behind and goes into "detached head state". So the next modification of HEAD no more affects any branch. Detaching HEAD does not affect the worktree nor the index.
git reset --soft commitish then moves HEAD to the SHA of the given commitish. If you want to update the index, too, leave --soft away, but I do not recommend to do so. This, again, does not touch the worktree, and (--soft) not the index.
git checkout commitish then attaches HEAD to the given commitish (branch) again. (If commitish is a SHA nothing happens.) This, too, does not affect index nor worktree.
This solution accepts everything which refers to a commit, so this is ideal for some git alias. The rev-parse below is just a test to make sure, nothing breaks in the chain, such that typos do not accidentally switch into detached head state (error recovery would be way more complex).

This leads to following git switch treeish alias:
```

git config --global alias.switch '!f() { git rev-parse --verify "$*" && git checkout "HEAD^{}" && git reset --soft "$*" && git checkout "$*"; }; f'

```

FYI, you can find it in my list of git aliases.