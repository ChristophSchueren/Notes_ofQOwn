# Relationale Datenbank

-Schutz vor Anomalien beim Einfügen, Löchen und Update, Konsistenz
-Blockchain in relationaler Datenbank?
-Lock on Writing bei multi instance Access (Microservices können mehrfach vorhanen sein)
-Polymorphie in relationaler Datenbank?





## Writing
1. Buchung (Eigene Entität mit eigener Tabelle = "Log") schreiben
2. Buchung prüfen (Status, Ausführungsdatum, Queued, Doing, Done)
3. Zustand der betroffenen Daten prüfen
4. Buchung durchführen

Transaktionen verwenden?

## Problem der Vielgestaltigkeit von Assets
- individuelle Attribute
- Attribute des Typs
- Polymorphie zu statisch (compile time)

## Nachteile von SQL
- Typisches **Accesspattern** (Asset mit allen seinen Eigenschaften) der Daten erfordert viele Joins
	- dritte Normalform
	- 1-1 Beziehungen
	- langsam

- Aus gleichem ER-Modell Dokumenten-Datenbank-Modell entwickelt
	- Embedded List of Eigenschaften
	- also Dokumentendatenbank

- Dokumentendatenbank MongoDB von JHipster Generator unterstützt

- Abfragen an Dokumentendatenbank mit QueryByExample und strukturierten JSON dokumenten möglich
- Aggregations mächtig
- Indices auf embedded properties möglich => Aggregations schnell


Ausblick:
Mit Abschluss des Praktikumsprojekts
Nach Abschluss der Projektarbeit auch noch Filter und Queries integriert