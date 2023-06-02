FROM maven:3.8.2-openjdk-17

WORKDIR /crud_imdb
COPY . .

RUN mvn clean install -DskipTests

CMD mvn spring-boot:run
