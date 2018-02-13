DbRef
=====

siehe referenzielle Integrität Constraints:
Foreign Key Constraints zur Sicherstellung der referentiellen Integrität ist in der NoSQL Dockumentendatenbank MongoDB nicht vorgesehen.

Pro Embedding
- Alle Daten in einer Abfrage
- Schnelligkeit
- Atomare Änderungen am ganzen Dokument möglich
- Dokument ist in sich schlüssig
- gut für Beziehungen mit 1:1 Kardinalität



## Contra Embedding / für DbRef
- zu viele Daten in einer Abfrage
- Filtern vertraulicher Daten im Backend erforderlich
- Schlecht Anomalien können auftreten, auss
- Embeddete unabhängige Objekte, die in mehreren Dokumenten vorkommen, können inkonsistent werden.



## Contra DBRef
- erfordert manuelle Prüfung und Sichlerstellung der Foreign Key-Constraints in Business-Logic