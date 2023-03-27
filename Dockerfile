FROM eclipse-temurin:17-jdk-jammy
COPY ./target/spring-boot-data-mongodb-0.0.1-SNAPSHOT.jar spring-boot.jar
COPY ./src/main/resources/application.properties application.properties
CMD ["java","-jar","./spring-boot.jar", "--spring.config.location=./application.properties"]