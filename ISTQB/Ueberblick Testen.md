Ueberblick Testen
=================

Wie lassen sich Testverfahren klassifizieren?
Was wird getestet?
Komponente, Integration mehrerer Komponenten oder das ganze System.
Funktionale oder nicht-funktionale Anforderungen.
Wie werden sie durchgeführt?
Durch den Menschen (manuell) oder eine Maschine (automatisch).
Wer führt sie durch?
Entwickler oder Fachbereich.
Welche Kenntnisse sind für die Erzeugung von Testfällen nötig?
Nur das nach außen sichtbare Verhalten (Black-Box) oder auch der Sourcecode (White-Box).
Wann werden die Tests erstellt?
Test first vs. test last.
Alpha-/Beta-Test.
Wird die Software für den Test ausgeführt (dynamisch) oder nicht (statisch)?
Welches Ziel verfolgen die Tests?
Z.B. Regression verhindern, Last simulieren.
Was ist der Unterschied zwischen Black- und White-Box-Test?
Bei Black-Box-Tests kennt der Tester nicht die interne Struktur der Software, sondern sieht nur das nach außen sichtbare Verhalten. Beim White-Box-Test wird der Sourcecode mit einbezogen, um z.B. bestimmte Testfälle zu definieren.
Was sind Anweisungs-, Zweig- und Pfadüberdeckung?
Alle sind Maße für die Testabdeckung des Codes.
Bei der Anweisungsüberdeckung (C0) wird jede Anweisung im Code mind. einmal durchlaufen.
Bei der Zweigüberdeckung (C1) wird jeder Zweig im Code mind. einmal durchlaufen. Das heißt, bei if-Anweisungen wird sowohl der if-Zweig als auch der else-Zweig durch einen Test abgedeckt. Sie inkludiert die Anweisungsüberdeckung.
Bei der Pfadüberdeckung (C2) werden alle Pfade durch den Code getestet. Das heißt, dass z.B. alle möglichen Wege durch Schleifen abgedeckt sein müssen. Sie inkludiert die Zweigüberdeckung.
Was ist die zyklomatische Komplexität?
Ein Maß für die Anzahl der möglichen Pfade durch den Code.
Welche sonstigen Testverfahren gibt es noch?
Abnahmetest oder Akzeptanztest (User Acceptance Test): Finaler Test des Kunden, der das Projekt offiziell beendet.
Lasttest: Das System wird unter hohe Last gesetzt, um z.B. den gleichzeitigen Zugriff vieler Benutzer zu simulieren.
Smoketest: Erster grober Test der Software, um entscheiden zu können, ob weitere detaillierte Tests überhaupt sinnvoll sind.
Exploratives Testen: einfaches „Ausprobieren“ durch erfahrene Benutzer.