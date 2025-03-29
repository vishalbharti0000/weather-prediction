FROM openjdk:21-jdk-slim

WORKDIR /app

COPY target/cache-service-weather-prediction.jar /app/cache-service-weather-prediction.jar

EXPOSE 90

ENTRYPOINT ["java", "-jar", "cache-service-weather-prediction.jar"]
