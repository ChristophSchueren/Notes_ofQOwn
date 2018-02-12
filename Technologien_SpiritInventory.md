#Technologien für die Projektarbeit

- CASE (Computer Aided Software Engineering) Tool JHipster als Codegenerator zur Erstellung der Anwendung basierend einem UML-KlassenDiagramm. Es entsteht eine lauffähige Anwendung, die nach dem Erstellen nachträglich mit dem JHipster Generator modifiziert werden kann. Beispielsweise können nachträglich neue Entitäten hinzugefügt werden oder einer bestehenden Entität ein weiteres Feld hinzugefügt werden. Dies ist für den gewählten agile Softwarentwicklungsprozess nach Scrum wichtig, bei dem zu einem Sprint neue Anforderungen hinzukommen können, die tiefgreifendere Codeänderungen erfordern.
	- Enorme Beschleunigung des Entwicklungsprozess
	- Boilerplate Code muss nicht manuell erstellt werden
	- Nachträgliche Code-Änderungen mit Generatorunterstüzung möglich
	- Generator ändert/ erstellt geleichzeitig Entitäten auf Browser-Client (Angular, Javascript) und auf Serverseite (Spring Framework, Java)



- Testen 
	- Mit Unit Tests. 
	- Webinterface mit Selenium


- Datenmodell mit MongoDB
	- Inventarverwaltung benötigt flexible Datentypen, da es sehr viele verschiedene Inventartypen gibt. 
	- Bei der Nutzung des Programms ist ein Anwendungsfall, dass ein Inventaritem von einem neuem neuen, bisher unkatalogisierten Gerätetyp aufgenommen werden muss.
	- Zur Laufzeit muss eine neue Gerätetypbeschreibung 
	- Hartes Codieren von Klassen für die verschiedenen Gerätetypen entspricht dem objektorientierten Ansatz ist aber zu unflexibel, da für jeden neuen Gerätetyp ein Programmierer den Quellcode modifizieren müsste und die Serveranwendung neu starten müsste. In der Datenbank müsste ebenfalls eine neue Tabelle angelegt werden.


Erster Entwurf mit relationaler Datenbank
- Die firma betreibt bereits einen Postgres-SQL Server
- Dritte Normalform umgesetzt
- keine Anomalien
- Volle Editierbarkeit und Suchfunktion für Eigenschaften, sowohl key als auch value
- Viele Joins

MongoDB als NoSQL- Dokumentendatenbank
- Flexibilität: Jedes einzelne Dokument kann individuelle Felder und auch Feldkombinationen haben
- Standardisierte Verarbeitung wird auf diese weise schwierig, wenn die Datensätze unstrukturiert sind, also keine einheitliche Struktur haben.
- Keine Constraints, JOINs unüblich
- Kompromiss: Backend in der Statisch und Stark typisierten Sprache Java Geschrieben.
	- Klasse Gerät
		- definiert gemeinsame Felder
		- Merkmale als Hashmap<String, String> ausgeführt
			- wird durch Datenbank-Mapper automatisch auf ein Dokument-Objekt {"key1": "valueString1", "key2": "valueString2", ... } gemappt.

	- Ergebnis: 
		- Gezielte Flexibilität an bewussten Stellen (Felder von Merkmale")
		- Feste Strukturen vorgegeben (z.B. muss jedes Dok
		- Backend überwacht Einhaltung von Constraints in der Business-Logic und weist Anforderungen von  Schreibvorgängen, die Constraints verletzen würden ab und leitet sie nicht an die Datenbank weiter.


- Dokumentenstruktur in der Datenbank
- Klassenmodell im Backend
- Dokumentenstruktur im Frontend


Frontend: Single-Page Webanwendung
- Responsive: Größenanpassung der Website für portable Devices mit kleinen Bildschirmen.
- Flüssiges Benutzererlebnis (User Experience), weil nur kleine Datenmengen im Hintergrund zwichen Webbrowser und Server ausgetauscht werden müssen und somit keine    langen Ladezeiten auftreten.




Vergleich: Basisanwendung: Bild mit fertiger Anwendung

