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
- Schlecht für Beziehugen mit 1:n oder n:m Kardinalität:
	- Anomalien können auftreten
- Embeddete unabhängige Objekte, die in mehreren Dokumenten vorkommen, können inkonsistent werden.


## DBRef is valid:
@Override
	default <S extends Geraet> boolean exists(Example<S> arg0) {
		// TODO Auto-generated method stub
		return false;
	}



## Contra DBRef
- erfordert manuelle Prüfung und Sichlerstellung der Foreign Key-Constraints in Business-Logic