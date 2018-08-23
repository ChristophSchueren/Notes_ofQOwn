administering PostgresSQL
=========================
docker pull fenglc/pgadmin4

docker run --name some-pgadmin4 \
           --link some-postgres:postgres \
           -p 5050:5050 \
           -d fenglc/pgadmin4


Then you can hit http://localhost:5050 or http://host-ip:5050 in your browser.


docker run -p 5050:5050 -d fenglc/pgadmin4