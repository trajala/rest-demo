# rest-demo

This is a simple example of spring boot application and mysql server run in docker containers. The application has one rest api endpoint `customers` to get all the customer info from the db.

First make sure you have `jdk`, `maven`, `docker` and `docker-compose` installed.

Download the project and install with

```
mvn install
```

You can change the application and db info (ports, passwords, etc.) from the docker-compose.yml. After that you can build and start the containers with

```
docker-compose up --build -d
```

When the containers are running, the customer info can be requested by default with `http://localhost:5000/customers`

The customer data is initialized from file `db/dbinit.sql` (included in `docker-compose.yml` db init).
