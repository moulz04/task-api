# Build stage
FROM maven:3.8.4-openjdk-17-slim AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
# Note: task-core doit être installé dans le repo local maven du build
# Pour cet exercice, on suppose que l'image finale utilisera le JAR déjà construit
# ou on build directement si on a accès aux sources.

# Runtime stage
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/task-api-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "app.jar"]
