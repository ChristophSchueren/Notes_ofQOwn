enum Problem
============

enums stehen für zahlen.

Angular GUI verwendet aber Strings, die die voll ausgeschriebenen Bezeichnungen reperesentieren.

Lösung:
1. `public verfuegbarkeit?: Verfuegbarkeit | string, // Frontend mag Enum nicht`

2. einfach String zuweisen