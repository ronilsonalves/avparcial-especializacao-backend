FROM openjdk:19-jdk-alpine3.15
WORKDIR /config-server
EXPOSE 8888
COPY target/ConfigServer-0.0.1-SNAPSHOT.jar /config-server/app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]