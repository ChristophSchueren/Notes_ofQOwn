Stroy Fileupload
================

## Daten, die für Datei erfasst werden müssen

1. Datename inclusive Endung
2. Zugehöriges geraet zur Datei
3. individueller Text für Beschreibung: z.B. "Handbuch"

Optional
4. Datei-Größe
5. Hash Prüfsumme
6. Berechtigungsattribut: Darf User diese Datei herunterladen
	a. als enum
		- user allowed
7. User die Möglichkeit geben bestimmte Dateien, z.B. TÜV-Prüfberichte eines Autos hochzuladen
	- Möglichkeit muss VORAB von Office zu dem jeweilgen Geraet eingetragen sein (Autorisierung) - jeder Halter einer Sach

Idee: Entität Geraets im Backend erhält zusätzliches Attribut **dateiLinks** vom Typ Eigenschaften