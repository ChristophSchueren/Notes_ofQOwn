DbRef
=====

siehe referenzielle Integrität Constraints:
Foreign Key Constraints zur Sicherstellung der referentiellen Integrität ist in der NoSQL Dockumentendatenbank MongoDB nicht vorgesehen.

Pro Embedding
- Alle Daten in einer Abfrage
- Schnelligkeit
- Atomare Änderungen am ganzen Dokument möglich
- Dokument ist in sich schlüssig
- gut für 1-1 Be



## Contra Embedding / für DbRef
- zu viele Daten in einer Abfrage
- Filtern vertraulicher Daten im Backend erforderlich
- Anomalien können auftreten, auss
- Embeddete unabhängige Objekte, die in mehreren Dokumenten vorkommen, können inkonsistent werden.



## Contra DBRef
- erfordert manuelle Prüfung und Sichlerstellung der Foreign Key-Constraints in Business-Logic