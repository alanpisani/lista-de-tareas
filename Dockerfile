FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/app_todo-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app_todo_list.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app_todo_list.jar"]