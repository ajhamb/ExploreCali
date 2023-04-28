FROM openjdk:20

WORKDIR /app

COPY target/explorecali-0.0.1-SNAPSHOT.jar app.jar
COPY ExploreCalifornia.json src/main/resources/

CMD ["java", "-jar", "app.jar"]

