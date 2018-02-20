Maven Projekte
==============

## Beim Erzeugen von Maven Projekt

- Group Id: Id der Firma
- Artefact Id: eigentliches kleines Projekt

nur diese beiden müssen eingegeben werden

## Maven Standard-Ordner
src/main/java
src/main/resources
src/test/java
src/test/resources

ressources ist für Bild (jpg-Dateien, ...)

## Eclipse
ctrl + shift + F = Formatter run
alt + F5 Update Project


### pom.xml
```
<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>3.8.1</version>
			<scope>test</scope>
		</dependency>
```
scope: 