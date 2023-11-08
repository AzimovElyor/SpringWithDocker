FROM openjdk:17
EXPOSE 9090
ARG JAR_FILE=build/libs/SpringDocker-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} spring-docker
ENTRYPOINT ["java","-jar","spring-docker"]
