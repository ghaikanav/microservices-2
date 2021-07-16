FROM openjdk:11

LABEL COMPANY="Publicis Sapient"
LABEL MAINTAINER="prisingh23@publicisgroupe.net"
LABEL APPLICATION="API Gateway"

COPY target/api-gateway-0.0.1-SNAPSHOT.jar api-gateway.jar

EXPOSE 8765

ENTRYPOINT ["java", "-jar", "api-gateway.jar"]