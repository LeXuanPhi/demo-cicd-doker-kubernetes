FROM openjdk:11
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} demo-cicd-docker-kubernetes-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/demo-cicd-docker-kubernetes-0.0.1-SNAPSHOT.jar"]