FROM openjdk:17 AS BUILDER
COPY gradle gradle/
COPY gradlew settings.gradle build.gradle ./
COPY . .
RUN --mount=type=cache,target=/root/.gradle ./gradlew --no-daemon -i  clean build

FROM openjdk:17
COPY --from=BUILDER build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]