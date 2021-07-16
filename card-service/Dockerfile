FROM openjdk:11

LABEL COMPANY="Publicis Sapient"
LABEL MAINTAINER="prisingh23@publicisgroupe.net"
LABEL APPLICATION="Card Service"

COPY /target/card-service-0.0.1-SNAPSHOT.jar card-service.jar

EXPOSE 8050

ENTRYPOINT ["java", "-jar", "card-service.jar"]