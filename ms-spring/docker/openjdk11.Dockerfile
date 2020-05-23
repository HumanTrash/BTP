FROM adoptopenjdk/openjdk11:alpine-jre

MAINTAINER arturs.cernavskis96@gmail.com

RUN wget https://www.yourkit.com/download/docker/YourKit-JavaProfiler-2019.8-docker.zip -P /tmp/ && \unzip /tmp/YourKit-JavaProfiler-2019.8-docker.zip -d /usr/local && \rm /tmp/YourKit-JavaProfiler-2019.8-docker.zip

ENV LD_LIBRARY_PATH=/lib64

COPY ./target/BTP-Spring-1.0-SNAPSHOT.jar /btp-spring-app.jar

CMD ["java",  "-XX:+UseStringDeduplication", "-agentpath:/usr/local/YourKit-JavaProfiler-2019.8/bin/linux-x86-64/libyjpagent.so=port=10001,listen=all", "-Dcom.sun.management.jmxremote", "-XX:+UseParallelGC","-Dcom.sun.management.jmxremote.port=9010", "-Dcom.sun.management.jmxremote.rmi.port=9010","-Djava.rmi.server.hostname=localhost", "-Dcom.sun.management.jmxremote.local.only=false","-Dcom.sun.management.jmxremote.authenticate=false","-Dcom.sun.management.jmxremote.ssl=false","-jar","/btp-spring-app.jar"]