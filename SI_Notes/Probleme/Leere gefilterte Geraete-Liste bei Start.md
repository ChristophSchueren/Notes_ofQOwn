Leere gefilterte Geraete-Liste bei Start
========================================

Fehler reproduzieren:
direkter Start von <http://localhost:9000/#/geraets>

- GeraetListService erzeugt Request zu früh ohne Authentication Token
- Angular sollte feststellen, dass 
