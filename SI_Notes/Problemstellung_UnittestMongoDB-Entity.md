Problemstellung_UnittestMongoDB-Entity
======================================

Hallo,

ich habe ein Problem in BuchungResourceIntTest.java die Route POST /buchungs zum Anlegen einer neuen Buchung zu testen.
Ich weiß nicht, wie ich in der Testklasse eine _gültige_ Buchung erstellen kann, die ein gültiges Geraet im Feld Buchung.geraet hat, die schon in der Datenbank gespeichert sein muss.

ssv verwendet für ähnliche Fälle in der Testklasse den EntityManager - import javax.persistence.EntityManager . Im MongoDB Backend ist das Paket nicht enthalten und kann nicht importiert werden.