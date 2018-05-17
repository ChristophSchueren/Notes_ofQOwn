Leere gefilterte Geraete-Liste bei Start
========================================

Fehler reproduzieren:
direkter Start von <http://localhost:9000/#/geraets>

- GeraetListService erzeugt Request zu früh **ohne Authentication Token**
- Angular sollte feststellen, dass nicht authorisiert ist
	- vor Anzeigen der Site zur Authentifizierung auffordern
	- Umleitung
	- Fehlermeldung in |async pipe mit else template
		- "keine Ergebnisse"
		- "nicht authentifiziert"
		- "Fehler bei Übertragung"
