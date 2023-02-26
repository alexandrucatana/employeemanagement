FROM openjdk:17-jdk-slim
LABEL maintainer="alexandrcatana81@gmail.com"
WORKDIR /app
ADD target/employeemanagement-0.0.1-SNAPSHOT.jar /app/springboot-restful-webservices.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","springboot-restful-webservices.jar"]