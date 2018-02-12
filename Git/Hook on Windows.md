Hook on Windows
===============

I’m using the 64-bit version of Git for Windows, so my shebang line looks like this.

```script
#!C:/Program\ Files/Git/usr/bin/sh.exe
```

Don’t forget to escape the space (‘ ‘) with a backslash. After you correct the path to sh.exe, your script should run okay.