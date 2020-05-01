FROM openjdk:8-jdk-alpine

MAINTAINER arturs.cernavskis96@gmail.com

COPY ./target/BTP-Spring-1.0-SNAPSHOT.jar /btp-spring-app.jar

CMD ["java", "-jar", "/btp-spring-app.jar"]