FROM openjdk:8-jdk-slim

ADD Products-0.0.1-SNAPSHOT.jar .

ENTRYPOINT ["java","-jar","Products-0.0.1-SNAPSHOT.jar"]



