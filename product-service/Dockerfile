FROM openjdk:11

LABEL COMPANY="Publicis Sapient"
LABEL MAINTAINER="prisingh23@publicisgroupe.net"
LABEL APPLICATION="Product Service"

COPY target/product-service-0.0.1-SNAPSHOT.jar product-service.jar

EXPOSE 7050

ENTRYPOINT ["java", "-jar", "product-service.jar"]