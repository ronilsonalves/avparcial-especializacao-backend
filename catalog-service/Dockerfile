FROM openjdk:19-jdk-alpine3.15
WORKDIR /catalog-service
EXPOSE 8082
COPY target/catalog-service-0.0.1-SNAPSHOT.jar /catalog-service/app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]