1 Design
========

Radio Buttons component statt Dropdown für Geraet.verfuegbarkeit wahl, default auf genutzt

#### Entitäten-Änderungen
- neues Feld Geraet.name
- users (3) in Geraet statt als DBRef als user.login String speichern
	- nachteile DBRef: 
	- langsam: Backend füllt immer user bei Abfrage eines jeden Geräts (viele Abfragen für Listendarstellung)
	- Übertragen ungenutzter Daten: jedes angefragte Geraet enthält überrträgt einen ausgefüllten Nutzer
	- sortierbarkeit: DBRefs haben keine Sortierreihenfolge und daher kann in der Geräteliste nicht nach User.login namen sortiert werden
	- Datenbank-Collection Gerät würde sich durch die 

- GeräteType alzeigen als Geräte-Typ (Übersetzung)
- Geraet Id Spalten weg


 - Home-Component
- Button: Geraete-Typen verwalten

#### Detail Button weg
- /geraetType
- /buchungs

#### Name Statt ID
Id Spalten *UMBENNENEN*
- Titlelzeile der Tabellen = name
- **LINK** bleibt wie er war bestehen!!!!
- Beschriftung {{geraet.name}}


- Verfügbarkeit enum-Werte in kleine, deutsche Übersetzungen
- Verfügbarkeit als *Toggle buttons* -> Kombination
	- Wie zum Backend übertragen?

- /geraets
	- kleine edit buttons weg
	- Filter own weg
	- Filter all setzt alle Verfuegbarkeit -Filter auf allowed
	- entsorgt default ausgeblendet
		- showEntsorgt = true

- Component mit 

heute
- toggle buttons in /geraets
- filter richtig nach verfuegbarkeit
- geraet endgültig entsorgen (über Buchung, die nicht gespeichert wird)
