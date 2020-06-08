#!/bin/bash
# commands from :
# https://spring.io/guides/gs/spring-boot-docker/

./mvnw package
java -jar target/gs-spring-boot-docker-0.1.0.jar
docker build -t springio/gs-spring-boot-docker .
docker run -p 8080:8080 springio/gs-spring-boot-docker