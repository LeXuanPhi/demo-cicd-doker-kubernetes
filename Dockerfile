FROM openjdk:11
COPY target/demo-cicd-docker-kubernetes-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]