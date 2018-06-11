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
2. Neue Einträge unter jhi_user (7 Stück)

```
/* 1 */
{
    "_id" : "user-0",
    "_class" : "com.spirittesting.spiritinventory.domain.User",
    "login" : "system",
    "password" : "$2a$10$mE.qmcV0mFU5NcKh73TZx.z4ueI/.bDWbj0T1BYyqP481kGGarKLG",
    "first_name" : "",
    "last_name" : "System",
    "email" : "system@localhost",
    "activated" : true,
    "lang_key" : "en",
    "authorities" : [ 
        {
            "_id" : "ROLE_USER"
        }, 
        {
            "_id" : "ROLE_ADMIN"
        }
    ],
    "created_by" : "system",
    "created_date" : ISODate("2018-03-06T20:39:02.751Z"),
    "last_modified_by" : "admin",
    "last_modified_date" : ISODate("2018-03-07T08:15:11.922Z")
}

/* 2 */
{
    "_id" : "user-1",
    "_class" : "com.spirittesting.spiritinventory.domain.User",
    "login" : "anonymoususer",
    "password" : "$2a$10$j8S5d7Sr7.8VTOYNviDPOeWX8KcYILUVJBsYV83Y5NtECayypx9lO",
    "first_name" : "Anonymous",
    "last_name" : "User",
    "email" : "anonymous@localhost",
    "activated" : true,
    "lang_key" : "en",
    "authorities" : [],
    "created_by" : "system",
    "created_date" : ISODate("2018-03-06T20:39:02.860Z"),
    "last_modified_by" : "system",
    "last_modified_date" : ISODate("2018-03-06T20:39:02.861Z")
}

/* 3 */
{
    "_id" : "user-2",
    "_class" : "com.spirittesting.spiritinventory.domain.User",
    "login" : "admin",
    "password" : "$2a$10$rK57pP8MWLBie6J.VBDEuutrFuT8OKEAnreodhafaz/qz5WTG2Vry",
    "first_name" : "admin",
    "last_name" : "Administrator",
    "email" : "admin@localhost",
    "activated" : true,
    "lang_key" : "en",
    "authorities" : [ 
        {
            "_id" : "ROLE_USER"
        }, 
        {
            "_id" : "ROLE_ADMIN"
        }
    ],
    "created_by" : "system",
    "created_date" : ISODate("2018-03-06T20:39:02.867Z"),
    "last_modified_by" : "admin",
    "last_modified_date" : ISODate("2018-04-10T10:44:35.795Z")
}

/* 4 */
{
    "_id" : "user-3",
    "_class" : "com.spirittesting.spiritinventory.domain.User",
    "login" : "user",
    "password" : "$2a$10$VEjxo0jq2YG9Rbk2HmX9S.k1uZBGYUHdUcid3g/vfiEl7lwWgOH/K",
    "first_name" : "",
    "last_name" : "User",
    "email" : "user@localhost",
    "activated" : true,
    "lang_key" : "en",
    "authorities" : [ 
        {
            "_id" : "ROLE_USER"
        }
    ],
    "created_by" : "system",
    "created_date" : ISODate("2018-03-06T20:39:02.873Z"),
    "last_modified_by" : "system",
    "last_modified_date" : ISODate("2018-03-06T20:39:02.876Z")
}

/* 5 */
{
    "_id" : "office",
    "_class" : "com.spirittesting.spiritinventory.domain.User",
    "login" : "office",
    "password" : "$2a$10$gSAhZrxMllrbgj/kkK9UceBPpChGWJA7SYIb1Mqo.n5aNLq1/oRrC",
    "first_name" : "Office",
    "last_name" : "Office",
    "email" : "office@localhost",
    "activated" : true,
    "lang_key" : "en",
    "authorities" : [ 
        {
            "_id" : "ROLE_OFFICE"
        }
    ],
    "created_by" : "system",
    "created_date" : ISODate("2018-03-06T20:39:02.879Z"),
    "last_modified_by" : "system",
    "last_modified_date" : ISODate("2018-03-06T20:39:02.881Z")
}

/* 6 */
{
    "_id" : "user-bill",
    "_class" : "com.spirittesting.spiritinventory.domain.User",
    "login" : "bill",
    "password" : "$2a$10$VEjxo0jq2YG9Rbk2HmX9S.k1uZBGYUHdUcid3g/vfiEl7lwWgOH/K",
    "first_name" : "",
    "last_name" : "User",
    "email" : "bill@localhost",
    "activated" : true,
    "lang_key" : "en",
    "authorities" : [ 
        {
            "_id" : "ROLE_USER"
        }
    ],
    "created_by" : "system",
    "created_date" : ISODate("2018-03-06T20:39:02.885Z"),
    "last_modified_by" : "system",
    "last_modified_date" : ISODate("2018-03-06T20:39:02.886Z")
}

/* 7 */
{
    "_id" : ObjectId("5ad848dcd3c94c36dc50807e"),
    "_class" : "com.spirittesting.spiritinventory.domain.User",
    "login" : "annahoffmanns",
    "password" : "$2a$10$cEY8o8jJtihpLjVylRYZ5uQsvR5UiSlldppfZg64ZgDw6ESVpBEa2",
    "first_name" : "Anna",
    "last_name" : "Hoffmanns",
    "email" : "annahoffmanns@localhost",
    "activated" : true,
    "lang_key" : "de",
    "reset_key" : "39473312024013719673",
    "reset_date" : ISODate("2018-04-19T07:44:27.986Z"),
    "authorities" : [ 
        {
            "_id" : "ROLE_USER"
        }
    ],
    "created_by" : "admin",
    "created_date" : ISODate("2018-04-19T07:44:27.997Z"),
    "last_modified_by" : "admin",
    "last_modified_date" : ISODate("2018-04-19T07:44:27.997Z")
}
}


```

Die noch bestehenden Einträge sind ALT.
Neue Einträge wurden aber gelöscht!!!


Wo werden DB Drop ausgeführt???
Im Java Code

- Item Entsorgen
- Check if User exists (eigentlich nur lesen)
- Pre-Write service

Ursächlich möglicherweise: Öffnen  der Datenbank mit alter java-App. Aber Mongobee hat keinen Eintrag angelegt
