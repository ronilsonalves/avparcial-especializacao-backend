FROM openjdk:19-jdk-alpine3.15
WORKDIR /movie-service
EXPOSE 8081
COPY target/movie-service-0.0.1-SNAPSHOT.jar /movie-service/app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]