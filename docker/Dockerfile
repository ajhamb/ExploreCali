# Alpine Linux with OpenJDK JRE
FROM openjdk:20

# Copy war file
COPY explorecali-0.0.1-SNAPSHOT.jar /explorecali.war
COPY ExploreCalifornia.json .

# run the app
CMD ["/usr/bin/java", "-jar", "/explorecali.war"]