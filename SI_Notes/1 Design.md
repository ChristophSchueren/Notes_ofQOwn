1 Design
========

#### Formatänderungen
- neues Feld Geraet.name
- users (3) in Geraet werden direkt als primary Key gespeichert (kein DBRef)
	- nachteile DBRef: 
	- langsam: Backend füllt immer user bei Abfrage eines jeden Geräts (viele Abfragen für Listendarstellung)
	- Übertragen ungenutzter Daten: jedes angefragte Geraet enthält überrträgt einen ausgefüllten Nutzer
	- sortierbarkeit: DBRefs haben keine Sortierreihenfolge und daher kann in der Geräteliste nicht nach User.login namen sortiert werden
	- Datenbank-Collection Gerät würde sich durch die 