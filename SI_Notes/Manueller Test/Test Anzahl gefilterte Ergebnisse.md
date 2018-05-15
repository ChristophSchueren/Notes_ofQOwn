Test: Anzahl gefilterte Ergebnisse
========================

# Datensatz

inv_geraet_copy_10001

Datensaetze ungefiltert: 12498
`db.getCollection('inv_geraet').find({}).count()` 12494
`db.getCollection('inv_geraet_copy_10001').find({}).count()`

Datensaetze ({verfuegbarkeit:"ENTSORGT"}): 2493
`db.getCollection('inv_geraet').find({verfuegbarkeit:"ENTSORGT"}).count()` 2493
`db.getCollection('inv_geraet_copy_10001').find({verfuegbarkeit:"ENTSORGT"}).count()`


## Testdaten-Generator
> Testdaten anlegen ist ein Test
- falls **Fehler** bei Anlegen:
	- Log to Console
	- Pause Execution (Background thread?...) -> Interaktionen oder Abbrechen
	- Backend operation via Rest
	- **Summary** am Ende mit Fehlern
	- verwende Angular Test-Framework (Interaktionen?)
	- bedingtes Compilieren von Angular

> Konsistenz ist wichtig: NEU
- inv_geraet
- inv_geraet_type

> Backup


> Upload to Cloud Mongo
TestDaten-Generator: Es duerfen **keine** Datensaetze mit ENTSORGT angelegt werden

> Geraets im Zweiten Schritt manuell entsorgen 
- genau 20 geraete entsorgen

# Testskripts MongoDB analytics
	- diff collections
		- count
		- document contents
		- show overview of Results (counts)
		- verify if log correctly written
	- mongoshell script mit Typescript support? `mongoshell.d.ts` vorgefertigt?

# Output

## Standard-Filter (keine geraet.verfuegbarkeit=entsorgt)

## Alle Items geraet

## Datenbank: alle Items Anzahl

### Code zur MongoDB abfrage

`db.getCollection('inv_geraet').find({}).count()`

`db.getCollection('inv_geraet').findOne({verfuegbarkeit:"ENTSORGT"})`