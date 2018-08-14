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
Docker Taskbar Icon -> Re