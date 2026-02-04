FROM eclipse-temurin:17-jre
EXPOSE 8082
ADD target/magnus-docker-integration.jar magnus-docker-integration.jar
ENTRYPOINT ["java", "-jar", "/magnus-docker-integration.jar"]