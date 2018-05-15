Testing with Spring -> Integration tests
===================

> Spring integration tests allow you to test functionality against a running Spring application, and thereby allows to test against a running database instance. 
<https://dzone.com/articles/spring-integration-tests>

But as you do in unit tests, you have to perform a proper set up of test data, and clean up the database afterwards. That's what this article is about: proper database set- and clean-up in Spring integration tests with MongoDB.


## Mögliche Komplikationen
1. Falsche Datenbank -> sofortiger Abbruch
2. Changeset von Mongobee eingespielt?

## Neue Kopien testclassIntegration.java


#  Mock

// is EmbedMongo running? JA
        // <artifactId>de.flapdoodle.embed.mongo</artifactId> in pom.xml

MockitoAnnotations.initMocks(this);

// woher weiß Mockito, wie Mock zu initialisieren ist (hier: EmbedMongo)
	- ich will eche DB **spiritinventorytest** nutzen
	- Alle Repos usw. muessen darauf umgebogen werden
	- copyAnweisung fuer TestDaten aus bereitgehaltenem fertigen Datenbank
		- nur leseRechte **spiritinventoryreadonlytest**
			- anderes Umbiegen
			- mongodb soll exception werfen, wenn schreibanweisung kommt
			- fuer /vervollstaendigungs-te