#Microservices

##Ueberlegungen
API first development using swagger-codegen?
Scaling for the right size (Aufwand sparen)
Welche Zielsystem-Größe?

Abhängigkeit von Benutzerkonten des anderen Systems?
Was geschieht, wenn Benutzerkonto gelöscht werden soll (Recht auf Löschung)?
Duplikat im Itemvervaltung Microservice?

Authentifizierung
-Sicherheitskritisch, da wertvolle Items verwaltet werden
-Blockchain zur Logspeicherung?
-SAML  OAuth 2.0 , tokenbasiert ist gut geeignet
-Grenze der sicheren Zone? Authentifizierung an Zonengrenze

##Autonomous Service
-Can be built and deployed indepentently (Auth?)
A service owns all the state it immediately depends on and that it manages
- owns its communication contract
- Service is the authority for holding and managing its data (Problem: User Accounts gehören )

##Kriterien guter Architektur:
https://12factor.net/

I. Codebase
One codebase tracked in revision control, many deploys
II. Dependencies
Explicitly declare and isolate dependencies
III. Config
Store config in the environment
IV. Backing services
Treat backing services as attached resources
V. Build, release, run
Strictly separate build and run stages
VI. Processes
Execute the app as one or more stateless processes
VII. Port binding
Export services via port binding
VIII. Concurrency
Scale out via the process model
IX. Disposability
Maximize robustness with fast startup and graceful shutdown
X. Dev/prod parity
Keep development, staging, and production as similar as possible
XI. Logs
Treat logs as event streams
XII. Admin processes
Run admin/management tasks as one-off processes