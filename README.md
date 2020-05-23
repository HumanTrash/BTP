#### Bachelor's thesis practical

#### Microservices development using Micronaut framework

##### Technologies used
* Java 8 & 11
* Spring & Spring Boot
* Micronaut
* PostgreSQL
* Docker  

##### Tools used for testing  
* Apache JMeter
* YourKit profiler

To imitate a somewhat realistic use case, both microservices perform basic CRUD operations with the database using NASA's JPL Near Earth Object
REST API data model, both microservices are also able retrieve data from the API to populate the database.
##### How to run
Required:  
* Java JDK
* Maven v3+
* Docker

Open the project directory root and  run: ```mvn clean install```  
followed by ```sh docker-compose-openjdk8.sh``` for the Java 8 implementation.  
Or ```sh docker-compose-openjdk11.sh``` to use the Java 11 implementation, before running remember to switch the jdk.version property in the parent pom.xml file that's located in project root and run ```mvn clean install```.

This will build and start 5 containers:  
* Adminer for accessing the PostgreSQL databases
* 2 PostgreSQL database containers for each microservice
* Micronaut microservice
* Spring microservice  

Port numbers can be found and changed in the docker-compose YAML files if necessary. To interact with the microservice REST API use the port that's mapped to container's port 8080, the second port is for attaching the YourKit profiler.