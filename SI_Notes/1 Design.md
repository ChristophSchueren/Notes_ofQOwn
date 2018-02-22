1 Design
========

#### Formatänderungen
- neues Feld Geraet.name
- users (3) in Geraet werden direkt als primary Key gespeichert (kein DBRef)
	- nachteile DBRef: langsam: Backend füllt immer user bei Abfrage eines jeden 