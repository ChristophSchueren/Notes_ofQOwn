Lifecycle Hooks
===============

*onBeforeConvert* - called in MongoTemplate insert, insertList and save operations before the object is converted to a DBObject using a MongoConveter.

*onBeforeSave* - called in MongoTemplate insert, insertList and save operations before inserting/saving the DBObject in the database.

*onAfterSave* - called in MongoTemplate insert, insertList and save operations after inserting/saving the DBObject in the database.

*onAfterLoad* - called in MongoTempnlate find, findAndRemove, findOne and getCollection methods after the DBObject is retrieved from the database.

*onAfterConvert* - called in MongoTempnlate find, findAndRemove, findOne and getCollection methods after the DBObject retrieved from the database was converted to a POJO.