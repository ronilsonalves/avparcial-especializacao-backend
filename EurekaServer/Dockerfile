FROM openjdk:19-jdk-alpine3.15
WORKDIR /eureka-server
EXPOSE 8761
COPY target/EurekaServer-0.0.1-SNAPSHOT.jar /eureka-server/app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]