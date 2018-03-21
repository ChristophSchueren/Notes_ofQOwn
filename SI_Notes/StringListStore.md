StringListStore
===============

Klasse
1. Zum Abrufen von Aggregations
2. Speichertyp fuer allegemeine Parameter
	- Vervollstaendigungen fuer Standort
	- cachen von Aggregations
		- Liste der GeraetType - namen
3. Service sucht cache oder fuerhrt Aggregation aus und cached
	- Rücksetzmechanismus: delete StringListStore mit id oder name	

Enitaet StringListStore {
id: String
name: string
werte: string[]
}