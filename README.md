# ExploreCali

Test project for CI with Cloud build and CD with Harness or other tool

Tech Stack used is Spring boot with Java

To run container from Docker
docker run -p 127.0.0.1:8080:8080/tcp -d ajhambdock/explorecali-be:latest

To run container from gcr , run in cloud shell
docker run -p 127.0.0.1:8080:8080/tcp -d gcr.io/explorecalicicd/explorecali-be:latest

docker rm -f CONTAINER_ID