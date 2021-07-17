FROM maven:3.6-alpine as DEPS

WORKDIR /opt/app
COPY api-gateway/pom.xml module1/pom.xml
COPY card-service/pom.xml card-servic/pom.xml

