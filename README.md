#### Bachelor's thesis practical

#### Microservices development using Micronaut framework

###### Thesis

Micronaut is more appropriate/suitable tool for cloud computing needs in developing microservices than traditional tools like Spring.

In this work author will describe what are microservices and their basic applications.

Author will research what is the traditional framework memory consumption and performance, to develop similar type of microservices with Micronaut framework and to compare resource consumption profiles;

##### Technologies used
* Java
* Spring & Spring Boot
* Micronaut
* PostgreSQL
* Docker  

##### Tools used for testing  
* Apache Jmeter
* VisualVm

To imitate a somewhat realistic use case, both microservices perform basic CRUD operations with the database using NASA's JPL Near Earth Object
REST API data model, both microservices are also able retrieve data from the API to populate the database.
##### How to run
Required:  
* Java JDK
* Maven v3+
* Docker

Open the project directory root and  run: ```mvn clean install```  
followed by ```sh docker-compose-openjdk.sh``` for the OpenJDK Java implementation.  
Or ```sh docker-compose-oracle.sh``` to use the Oracle Java implementation.

This will build and start 5 containers:  
* Adminer for accessing the PostgreSQL databases
* 2 PostgreSQL database containers for each service
* Micronaut microservice
* Spring microservice  
