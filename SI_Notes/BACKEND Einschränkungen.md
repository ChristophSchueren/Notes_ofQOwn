BACKEND Einschränkungen
=======================

- Entsorgte Geräte dürfen nicht mehr bearbeitet oder gebucht werden
- über geraet/ PUT dürfen nur Eigenschaften verändert werden: Test geraetOnlyChangesMerkmale
- BerechtigungCheckService
	- holt sich das Geraet aus dem Repository
- über ChangeDialog kann prinzipiell nur der User geändert werden
	- Problem: Entsorgte Geräte