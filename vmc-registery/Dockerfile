FROM openjdk:8-alpine

# This command required for starting application up.
RUN apk update && apk add bash

RUN mkdir -p /opt/app
ENV PROJECT_HOME /opt/app

ARG JAR_FILE=target/vmc-registry-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} $PROJECT_HOME/app.jar

WORKDIR $PROJECT_HOME

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom","-jar","./app.jar","vmc-registry"]
