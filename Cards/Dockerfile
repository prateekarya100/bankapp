FROM openjdk:21-jdk-slim
LABEL "org.opencontainers.image.authors"="prateekarya100@gmail.com"
COPY target/cards-0.0.1-SNAPSHOT.jar "cards-0.0.1-SNAPSHOT.jar"
RUN javac cards-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java,-jar","cards-0.0.1-SNAPSHOT.jar"]