To start Postgres in Docker:
1. `docker run --name postgres -e POSTGRES_PASSWORD=postgres -d -p 5432:5432 postgres`
2. `docker exec -it <CONTAINER_ID> bin/bash`
3. `psql -U postgres`
4. `CREATE DATABASE registration;`



Don't forget to set password and username to your database connection in 'application.yaml'.

