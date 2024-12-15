FROM openjdk:17-jdk-slim
LABEL "org.opencontainers.image.authors"="prateekarya100@gmail.com"
COPY target/loans-0.0.1-SNAPSHOT.jar "loans-0.0.1-SNAPSHOT.jar"
CMD ["java", "-jar", "loans-0.0.1-SNAPSHOT.jar"]
ENTRYPOINT ["java -jar","loans-0.0.1-SNAPSHOT.jar"]
