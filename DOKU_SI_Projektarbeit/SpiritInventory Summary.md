# SpiritInventory Summary


Erstellen einer Webappliktaion "**Spirit-Inventory**" zur elektronischen Inventarverwaltung, zur Digitalisierung der Inventarverwaltung für die Firmen Spirit-Testing GmbH und Spirit-Onsise GmbH.


Die bisher papiergestützte Inventarverwaltung in mehreren Ordnern an den verschiedenen Standorten der Firma soll auf ein Zentrales Webportal verlegt und gebündelt werden. 
Dadurch erhalten Berechtigte schnell und von überall Zugriff auf die aktuellen Inventardaten, z.B. welcher Mitarbeiter welches Notebook von der Firma gestellt bekommen hat.
Änderungen, z.B. die Übertragung eines Notebooks von einem Angestellten auf eine anderen soll nachvervolgbar eingetragen werden können.

# Buzz-Words
- Self-Contained System mit eigener Datenbank
- Generator
- CASE Tool Computer aided Software development
- JHipster Ecosystem
- Tomcat Java Webserver
	- Als Servlet Container soll Apache Tomcat zum Einsatz kommen.


# Integrationsmodell
- Frontend-Interation durch Links


Programmierung einer Webanwendung Inventarverwaltung 
Angliederung an Spirit Skill Profile Verwaltung (SSV) in der Programmierkenntnisse der Mitarbeiter verwaltet und dargestellt werden.

Das neue Modul soll Inventarartikel (z.B. Schlüssel, Notebook, ...) der Firma sammeln, speichern und festhalten, welchem Mitarbeiter der Inventarartikel in welchem Zeitraum anvertraut war.


Microservice mit REST Api. Eigenständige Applikation, die auf die Datenbank zugreift und Informationen zu Inventarartikeln zugänglich macht.
"Digitaler Zwilling" Digitalisierung

TODO: Sicherheitskonzept und Tests

Vorhandene relationale Datenbank wird um zuätzliche Tabellen zur Inventarverwaltung ergänzt.

Verknüpfung mit bestehenden Mitarbeiterprofilen in der Datenbank um erfassen zu können, welcher Mitarbeiter welche Inventarartikel zu welchen Zeiträumen genutzt hat.

Inventarartikel einfach: Schlüssel, aber auch komplexer wie angemietete Firmenwohnungen, die rechtzeitig gekündigt werden müssen oder Dienswägen, bei denen an Termine zur Inspektion erinnert werdne soll.

Das Projekt beinhaltet auch eine Modifikation des bestehenden Angular Frontends der Webanwendung "Mitarbeiter-Profile", damit die Inventar-Gegenstände an geeigneten Stellen angezeigt werden können.


Mit durchdachten **Ordnungssystemen** lassen sich wichtige Dokumente **schneller wiederfinden**. Dazu gehören auch elektronische Rechnungseingangsbearbeitungen sowie die Digitalisierung von Ordnern und Akten.

**Gute Suchfunktion**	

# Wohnungen 
nicht Bestandteil
# Erinnerungsfunktion
nicht Bestandteil

