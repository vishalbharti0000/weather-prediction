FROM openjdk:21-jdk-slim

WORKDIR /app

COPY target/advice-service-weather-prediction.jar /app/advice-service-weather-prediction.jar

EXPOSE 91

ENTRYPOINT ["java", "-jar", "advice-service-weather-prediction.jar"]
