Test: Anzahl gefilterte Ergebnisse
========================

# Datensatz

inv_geraet_copy_10001


# Output

## Standard-Filter (keine geraet.verfuegbarkeit=entsorgt)

## Alle Items geraet

## Datenbank: alle Items Anzahl

### Code zur MongoDB abfrage

`db.getCollection('inv_geraet').find({}).count()`