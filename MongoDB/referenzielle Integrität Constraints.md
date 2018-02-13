referenzielle Integrität Constraints
====================================

Foreign Key Constraints zur Sicherstellung der referentiellen Integrität ist in der NoSQL Dockumentendatenbank MongoDB nicht vorgesehen.

Der Datenbanktreiber und der Mapper in Spring unterstützt die Constraints ebenfalls nicht.

Daher in Businesslogic implementiert.
Es werden nur Daten in die Datenbank geschrieben, die den Constraints entsprechen.