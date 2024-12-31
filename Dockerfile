FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/rest-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} rest.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "rest.jar"]