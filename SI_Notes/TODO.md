TODO
====
### Filterung
1. Backen

- geraet-dialog-component
	- removeRequiredSettingOfTemplate() DONE



# Probleme

- C:\Users\Christoph\SpiritInventory\src\main\webapp\app\entities\geraet\geraet-changeuser-dialog.component.html
	-  <option value="GENUTZT" selected>{{'spiritInventoryApp.Verfuegbarkeit.GENUTZT' | translate}}</option>
	-  ist NICHT selected, aber Feld grün hinterlegt für Valid (geraet.neueVerfügbarkeit steht auf GENUTZT)
	- Lösung: Angular verwendet enum als String type: enumType | string

- key name "max. Bilddiagonale" wirft exception, wegen punkt im String"
	- Java Seite: Hashmap
-> Umstellung des Datenmodels
Merkmal {key: String , value: String}

Bootstrap
- two column Design

Datenbank Filter geraet ENTSORGT

Schöne Logs für Spring SLF4J

# Testen
create-dialog und 
changeuser-dialog 
- dürfen bei ungültigen Merkmalen NICHT absenden button enabeln!
- müssen Fehlermeldung-Zeile zeigen


# Develop-View Component
JSON einlesen, in DB speichern (nach Validierung!!)
Inventar-Gruppen ausgeben

# Abfrage geraet zeigt leere Liste
- wahrscheinlich kein login
- kommt exception von Server?
- Wie wird diese gehandhabt?
- wenn in Angular direkt zu /#geraet gesprungen wird
	- es sollte Login popup angezeigt werden

# Vervollstaendigung komponent zeigt ewig Warteschlange, wenn keine Ergebnisse vom Server angeboten werden
- funktioniert Server ohne Exception? (es sollte leere Vorschlagsliste kommen)
- Was macht Frontend mit einer leeren Liste?

# Dokumentation api fuer `/vervollstaendigungs` (Backend-Seite)
- requestParameters
- Vorlage von Swagger-Seite

# Merge mit Software-