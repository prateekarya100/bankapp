FROM openjdk:21-jdk-slim
LABEL "org.opencontainers.image.authors"="prateekarya100@gmail.com"
COPY target/accounts-0.0.1-SNAPSHOT.jar "accounts-0.0.1-SNAPSHOT.jar"
RUN javac accounts-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java,-jar","accounts-0.0.1-SNAPSHOT.jar"]