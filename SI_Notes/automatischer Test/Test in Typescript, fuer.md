Test in Typescript, fuer
========================

End-To-End

- Angular Frontend wird bedient


# Wunsch-Zugriff auf
## einfach realisierbar
Angular Oberfläche
## schwieriger realisierbar
Angular Services (gekapselt???) Link in Brower Window.browserData
Mongodb-Server / MongoShell (Beispiel Testscript, mongoproc open source?)
	- Datenbank zuruecksetzen
	- Datenbank-Set backuppen
	- Datenbank uebertragen an anderen Server
		- und anschließend überprüfen
> Fertige angular testrunner component?
	- pro
	- contra

> Realisierung mit TestOffice als zentraler Caller von Scripts???
	- ruft als zentrale Instanz verschiedene Programme auf
	- Feedback: Fehlermeldungen werden an TestOffice UI gemeldet (Errorlevel?)
	- MongoShell einsetzbar

> Spring Mocking MongoDB
	- wie Zugriff auf echte DB?
	- Spring (AspectOrientend) runtime zur Laufzeit Umbiegen auf `use testdata` Database
		- enable Aspect at runtime
		- development build vs. runtime build (flags?)

## Filter Test
### Definierter Test-Datensatz
### zugehoerige erwartete Ergebnisse
- Arrange, Act, Assert
### Check, if Database is Test-Database
- defined start state
	- entry count
	- entry names
	- objects as test db flags

