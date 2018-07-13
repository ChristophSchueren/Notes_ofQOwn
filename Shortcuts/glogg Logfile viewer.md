glogg Logfile viewer
====================

Keyboard commands
glogg keyboard commands try to approximatively emulate the default bindings used by the classic Unix utilities vi and less.

The main commands are:

arrows	scroll one line up/down or one column left/right
[number] j/k	move the selection 'number' (or one) line down/up
h/l	scroll left/right
[number] g	jump to the line number given or the first one if no number is entered
G	jump to the last line of the file (selecting it)
/	start a quickfind search in the current screen
n/N	repeat the previous quickfind search forward/backward
*/#	search for the next/previous occurence of the currently selected text
f	activate 'follow' mode, which keep the display as the tail of the file (like "tail -f")