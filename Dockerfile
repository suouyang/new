FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./enterprise/target/enterprise-1.0-SNAPSHOT.jar demojenkins.jar
ENTRYPOINT ["java","-jar","/demojenkins.jar", "&"]