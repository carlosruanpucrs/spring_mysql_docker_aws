FROM openjdk:11

WORKDIR /app

COPY target/microservices_aws_docker_usuario-0.0.1-SNAPSHOT.jar /app/api-alugantes.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "api-alugantes.jar"]
