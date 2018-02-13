DokumentenDatenbank MongoDB
===========================

### Gerät
- Eigenschaften Embedded ausgeführt
- DbRef auf User (n:1)


### Buchung
- ist NICHT embedded in Gerät
	- Vertraulichkeit der Daten
	- Unabhäniger Speicher zur Rekonstruktion von Gerät
- DbRef auf Gerät (Kardinalität n:1)