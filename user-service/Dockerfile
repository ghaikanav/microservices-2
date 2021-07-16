FROM openjdk:11

LABEL COMPANY="Publicis Sapient"
LABEL MAINTAINER="prisingh23@publicisgroupe.net"
LABEL APPLICATION="User Service"

COPY target/user-service-0.0.1-SNAPSHOT.jar user-service.jar

EXPOSE 9050

ENTRYPOINT ["java", "-jar", "user-service.jar"]