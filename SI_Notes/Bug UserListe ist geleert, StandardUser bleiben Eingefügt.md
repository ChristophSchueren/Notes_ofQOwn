Bug: UserListe ist geleert, StandardUser bleiben Eingefügt
==========================================================


Diagnose: Datenbank Changelog (Mongobee) zeigt keine Auffälligkeiten, keine neueren Einträge

```
/* 1 */
{
    "_id" : ObjectId("5a9efc661985384de8670a69"),
    "changeId" : "01-addAuthorities",
    "author" : "initiator",
    "timestamp" : ISODate("2018-03-06T20:39:02.560Z"),
    "changeLogClass" : "com.spirittesting.spiritinventory.config.dbmigrations.InitialSetupMigration",
    "changeSetMethod" : "addAuthorities"
}

/* 2 */
{
    "_id" : ObjectId("5a9efc661985384de8670a6a"),
    "changeId" : "02-addUsers",
    "author" : "initiator",
    "timestamp" : ISODate("2018-03-06T20:39:02.744Z"),
    "changeLogClass" : "com.spirittesting.spiritinventory.config.dbmigrations.InitialSetupMigration",
    "changeSetMethod" : "addUsers"
}
```
2. Neue Einträge unter 
