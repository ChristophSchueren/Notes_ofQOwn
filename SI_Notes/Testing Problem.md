Testing Problem
===============

BuchungResourceIntTest

post /buchung
schlägt mit Fehler 500 fehl. Schlecht.
Fehler 400 waere in Ordnung da Geraet mit GeraetId nicht in Datenbank ist.

```
TestBuchungValidity() {
	buchung.geraet in Datenbank
}
```
### Mögliche Lösung
vergleiche ssv ActivityResoucreIntTest