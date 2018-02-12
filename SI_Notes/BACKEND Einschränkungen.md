BACKEND Einschränkungen
=======================

- Entsorgte Geräte dürfen nicht mehr bearbeitet oder gebucht werden
- über geraet/ PUT dürfen nur Eigenschaften verändert werden: Test geraetOnlyChangesMerkmale
	- Problem: Entsorgte Geräte
- BerechtigungCheckService
	- holt sich das Geraet aus dem Repository
	- holt sich den aktuellen User-Login
- über ChangeDialog kann prinzipiell nur der User geändert werden
	- Problem: Entsorgte Geräte
- Geraet ohne User kann gespeichert werden / mit falschem User