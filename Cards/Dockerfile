FROM openjdk:17-jdk-slim
LABEL "org.opencontainers.image.authors"="prateekarya100@gmail.com"
COPY target/cards-0.0.1-SNAPSHOT.jar "cards-0.0.1-SNAPSHOT.jar"
CMD ["java", "-jar", "cards-0.0.1-SNAPSHOT.jar"]
ENTRYPOINT ["java -jar","cards-0.0.1-SNAPSHOT.jar"]