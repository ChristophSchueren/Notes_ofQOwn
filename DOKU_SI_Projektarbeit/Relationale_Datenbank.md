#Relationale Datenbank

-Schutz vor Anomalien beim Einfügen, Löchen und Update, Konsistenz
-Blockchain in relationaler Datenbank?
-Lock on Writing bei multi instance Access (Microservices können mehrfach vorhanen sein)
-Polymorphie in relationaler Datenbank?





##Writing
1. Buchung (Eigene Entität mit eigener Tabelle = "Log") schreiben
2. Buchung prüfen (Status, Ausführungsdatum, Queued, Doing, Done)
3. Zustand der betroffenen Daten prüfen
4. Buchung durchführen

Transaktionen verwenden?