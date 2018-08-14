docker
======

# Docker Abhängigkeiten starten:
docker-compose -f src\main\docker\jhipster-registry.yml up
docker-compose -f src\main\docker\postgressql.yml up

# Backend starten
.\mvnw

# Frontend starten
yarn start

# Docker Status
docker container ls


# Docker komplett neu starten
1. Docker Taskbar Icon -> Rechtsklick -> Quit docker
2. Startmenu Docker ausführen
3. Warten bis Docker Icon wieder erscheint
4. docker-compose ... wieder starten


# Docker Fehler wenn keine rechte
1. In Docker Windows Settings (Fenster) Zugriff shared auf C:\ erlauben
2. Windows firewall erlauben
3. Administrator-Rechte für docker-compose... NICHT nötig

