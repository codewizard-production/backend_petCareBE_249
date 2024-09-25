FROM maven:3.5-jdk-8-alpine as build
WORKDIR /app
COPY pom.xml pom.xml
COPY jpa jpa
COPY backend_petCareBE_249 backend_petCareBE_249
RUN mvn clean package -DnoTest=true

FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=build /app/backend_petCareBE_249/target/petCareBE-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
ENTRYPOINT ["sh", "-c"]
CMD ["java -jar petCareBE-0.0.1-SNAPSHOT.jar"]