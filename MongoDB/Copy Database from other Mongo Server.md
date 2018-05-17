Copy Database from other Mongo Server
=====================================

If you are using --auth, you'll need to include your username/password in there...

Also you **must be on the "destination" server** when you run the command.

db.copyDatabase(<from_db>, <to_db>, <from_hostname>, <username>, <password>);


### With ssh Tunnel

step 1: create a tunnel

ssh username@yourdomainOrIP -L 27018:localhost:27017
...Enter your password
step 2 :

mongo
use admin
db.copyDatabase(<fromdb>,<todb>,"localhost:27018",<username>,<password)
