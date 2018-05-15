Test: Anzahl gefilterte Ergebnisse
========================

# Datensatz

inv_geraet_copy_10001

Datensaetze ungefiltert: 12498
`db.getCollection('inv_geraet').find({}).count()`
`db.getCollection('inv_geraet_copy_10001').find({}).count()`

Datensaetze ({verfuegbarkeit:"ENTSORGT"}): 2493
`db.getCollection('inv_geraet').find({verfuegbarkeit:"ENTSORGT"}).count()`
`db.getCollection('inv_geraet_copy_10001').find({verfuegbarkeit:"ENTSORGT"}).count()`

# Output

## Standard-Filter (keine geraet.verfuegbarkeit=entsorgt)

## Alle Items geraet

## Datenbank: alle Items Anzahl

### Code zur MongoDB abfrage

`db.getCollection('inv_geraet').find({}).count()`

`db.getCollection('inv_geraet').findOne({verfuegbarkeit:"ENTSORGT"})`