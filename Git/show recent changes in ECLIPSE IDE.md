show recent changes in ECLIPSE IDE
==================================

1. Open the Preferences window (Hotkey: )
2. Search for "diff"
3. Select Quick Diff
4. Change the "Use this reference source" to a SCM provider (like CVS, SVN or Git)

By default, it compares to the latest version on disk, which, if you've saved the file, is no diff at all. You have to activate the comparison against a SCM repo. I'm not sure what happens if you more than one type of SCM since this is only a single selection.