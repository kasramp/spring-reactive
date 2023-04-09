# Spring Reactive

An example demonstrates how a Spring Reactive controller creates a flux of data. 
It generates a random user every second, mimicking pulling a huge number of data from a database.

To test, run the project,

```bash
$ ./mvnw spring-boot:run
```

Then hit the endpoint,

```bash
$ curl -N "http://localhost:8080/v1/users"
```