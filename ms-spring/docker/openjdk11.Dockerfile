FROM adoptopenjdk/openjdk11:alpine-jre

MAINTAINER arturs.cernavskis96@gmail.com

COPY ./target/BTP-Spring-1.0-SNAPSHOT.jar /btp-spring-app.jar

CMD ["java", "-Xmx2048M", "-Xms2048M", "-XX:+UseStringDeduplication", "-Dcom.sun.management.jmxremote","-Dcom.sun.management.jmxremote.port=9010", "-Dcom.sun.management.jmxremote.rmi.port=9010","-Djava.rmi.server.hostname=localhost", "-Dcom.sun.management.jmxremote.local.only=false","-Dcom.sun.management.jmxremote.authenticate=false","-Dcom.sun.management.jmxremote.ssl=false","-jar","/btp-spring-app.jar"]