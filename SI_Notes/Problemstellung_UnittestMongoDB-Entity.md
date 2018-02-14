Problemstellung_UnittestMongoDB-Entity
======================================

Hallo,

ich habe ein Problem für SpiritInventory in BuchungResourceIntTest.java die Route POST /buchungs zum Anlegen einer neuen Buchung zu testen.
Der Test braucht eine gültige Buchung zum Speichern. Buchung.geraet braucht ein geraet, das schon in der TestDatenbank gespeichert sein muss.

ssv verwendet für ähnliche Fälle in der Testklasse den EntityManager - import javax.persistence.EntityManager . Im MongoDB Backend ist das Paket nicht enthalten.

Der Test läuft mit einer mir unbekannten Datenbank-Emulation - auch ohne dass MongoDB gestartet ist. In der echten MongoDB gibt es keine Transaktionen.

Wie soll ich den Test durchführen?