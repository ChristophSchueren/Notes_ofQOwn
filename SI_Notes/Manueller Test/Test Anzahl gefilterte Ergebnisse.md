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
> Konsistenz ist wichtig
- inv_geraet
- inv_geraet_type
- inv_
TestDaten-Generator: Es duerfen keine Datensaetze mit Entsorgt _angelegt werden

# Output

## Standard-Filter (keine geraet.verfuegbarkeit=entsorgt)

## Alle Items geraet

## Datenbank: alle Items Anzahl

### Code zur MongoDB abfrage

`db.getCollection('inv_geraet').find({}).count()`

`db.getCollection('inv_geraet').findOne({verfuegbarkeit:"ENTSORGT"})`