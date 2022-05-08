# start with  base image containing java runtime

FROM openjdk:8-jdk-alpine

#make port 8989 avaible to the world outside this container 

EXPOSE 8686


COPY target/O2service-1.0-SNAPSHOT.jar  O2service-1.0-SNAPSHOT.jar

#Run the jar  file
ENTRYPOINT [ "java","-jar", "O2service-1.0-SNAPSHOT.jar"]