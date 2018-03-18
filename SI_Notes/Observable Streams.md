Observable Streams
==================

Stream zu QueryResults soll permanent existieren


Stream of requestParam wird verarbeitet.
-> debouncing und unique

Geraet-Component.loadAll bekommt buffered Strem, der den Letzten Wert immer laden kann.

Update nur bei neuen Serverergebnissen.


Subscription darf pro Geraet-Component nur EINMAL stattfinden.
**OnDestroy** Interface implementieren für unsubscribe.


Error-Handling für HTTP-get soll nicht mehr in geraetComponent.ts stattfinden.