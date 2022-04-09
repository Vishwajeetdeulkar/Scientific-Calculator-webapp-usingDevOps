FROM openjdk:11
EXPOSE 8085
ADD target/Scientific-Calculator-webapp-usingDevOps-0.0.1-SNAPSHOT.jar calculator.jar
RUN cat /etc/hosts
ENTRYPOINT ["java","-jar","calculator.jar"]
