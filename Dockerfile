FROM openjdk:17
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
RUN ./mvnw package -DskipTests
EXPOSE 8080
CMD ["java", "-jar", "target/demo-0.0.1-SNAPSHOT.jar"]
