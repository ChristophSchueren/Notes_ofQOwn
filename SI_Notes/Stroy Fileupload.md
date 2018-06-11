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
		- user not allowed
		- user allowed to read
		- user can upload
7. User die Möglichkeit geben bestimmte Dateien, z.B. TÜV-Prüfberichte eines Autos hochzuladen
	- Möglichkeit muss VORAB von Office zu dem jeweilgen Geraet eingetragen sein (Autorisierung) - jeder Halter des Asset hat dann diese Möglichkeit

Idee: Entität Geraets im Backend erhält zusätzliches Attribut **dateiLinks** vom Typ Eigenschaften
- key = name z.B. Handbuch
- value = URL z.B. file://dropbox.com/Spiritinventory/Assets/123/handbuchEN.pdf