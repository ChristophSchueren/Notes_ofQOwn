StringListStore
===============
> umbenennen

Klasse
1. Zum Abrufen von Aggregations
	- werden darauf projeziert
	- HTTP endpoint existiert
	- service fuer Aggregations existiert
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
erstellungszeit: datetime (veralten, loeschen)
}


api get stringliststore?type=ergaenzung&query=weitere