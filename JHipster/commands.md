commands
========

# Generator

Generatorbefehl:
jhipster entity --table-name INV_<ENTITY_NAME> EntityName

### Weitere Generatorbefehle
ng generate component my-component

jhipster export-jdl [jdlFile]
jhipster spring-service|service [name]  Create a new Spring service bean
jhipster spring-controller [name]       Create a new Spring controller

### Entity Update
jhipster 


## Test Builds
mvn clean package

### adding node dependencies
- DONT use npm
-` yarn add <xy>`
- will automatically save dependency to .json

### create Entity

### Testen mit Testabdeckung Check
`mvn clean install`
dann ins .\target Verzeichnis schauen
`SpiritInventory\target\test-results\coverage\jacoco`


### create Service
```code
jhipster spring-service Bar
```
will create BarService

### get jdl file
`export-jdl [jdlFile]`


### Starten
./mvnw -Pprod clean package
./mvnw
yarn start

#### Tests
mvn clean test
yarn e2e

#### java en
