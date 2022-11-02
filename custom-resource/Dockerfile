FROM maven:3.8.3-openjdk-17
EXPOSE 8080/tcp
COPY maven/target/*.jar /opt/app.jar
WORKDIR /opt
ENTRYPOINT [ "java", "-jar", "/opt/app.jar" ]
