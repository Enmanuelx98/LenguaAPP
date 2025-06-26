# Etapa 1: Build
FROM maven:3.8.6-openjdk-17 AS build
WORKDIR /app

# Copiar el pom.xml y la carpeta src
COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests

# Etapa 2: Imagen final
FROM openjdk:17-jdk-slim
WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
