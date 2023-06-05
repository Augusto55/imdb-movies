FROM maven:3.8.2-openjdk-17

WORKDIR /crud_imdb

COPY target/crud_imdb-0.0.1-SNAPSHOT.jar /crud_imdb/crud_imdb-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "crud_imdb-0.0.1-SNAPSHOT.jar"]
