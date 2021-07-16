FROM openjdk:11

LABEL COMPANY="Publicis Sapient"
LABEL MAINTAINER="prisingh23@publicisgroupe.net"
LABEL APPLICATION="Eureka Registry"

COPY target/eureka-0.0.1-SNAPSHOT.jar eureka.jar

EXPOSE 8761

ENTRYPOINT ["java", "-jar", "eureka.jar"]