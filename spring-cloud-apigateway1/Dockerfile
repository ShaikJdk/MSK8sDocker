FROM eclipse-temurin:21-jre
COPY target/spring-cloud-apigateway1-0.0.1-SNAPSHOT.jar api-gateway1.jar
EXPOSE 6060
ENTRYPOINT ["java","-jar","/api-gateway1.jar"]