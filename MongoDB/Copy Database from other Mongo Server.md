Copy Database from other Mongo Server
=====================================

If you are using --auth, you'll need to include your username/password in there...

Also you **must be on the "destination" server** when you run the command.

db.copyDatabase(<from_db>, <to_db>, <from_hostname>, <username>, <password>);
