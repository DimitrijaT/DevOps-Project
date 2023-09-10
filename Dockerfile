FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /kiii
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src src
RUN mvn package -DskipTests

FROM openjdk:17
WORKDIR /kiii
COPY --from=build /kiii/target/*.jar kiii.jar
EXPOSE 8080
CMD ["java", "-jar", "kiii.jar"]