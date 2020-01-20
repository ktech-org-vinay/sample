FROM openjdk:8-jdk-alpine
COPY build/libs/springboot-adapter-1.0.jar app.jar
ENV APP_PROFILE=development
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=${APP_PROFILE}", "app.jar"]
EXPOSE 8080
