static import
=============

`import static java.lang.Math.*;`

> Used appropriately, static import can make your program more readable, by removing the boilerplate of repetition of class names.

Once the static members have been imported, they may be used without qualification:
`double r = cos(PI * theta);`

The static import declaration is analogous to the normal import declaration. Where the normal import declaration imports classes from packages, allowing them to be used without package qualification, the static import declaration imports static members from classes, allowing them to be used without class qualification.

> If you overuse the static import feature, it can make your program unreadable and unmaintainable, polluting its namespace with all the static members you import.

