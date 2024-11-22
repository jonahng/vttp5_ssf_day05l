FROM openjdk:23-jdk

ARG app-dir=/app
ARG port=4000

WORKDIR ${app-dir}

COPY .mvn .mvn
COPY src src
COPY pom.xml .
COPY mvnw .
COPY mvnw.cmd .

RUN chmod a+x ./mvnw && ./mvnw clean package -Dmaven.test.skip=true

ENV SERVER_PORT 4000

EXPOSE ${SERVER_PORT}

# ENTRYPOINT [ "java","-jar","target/vttp5_ssf_day05l-0.0.1-SNAPSHOT.jar" ]
ENTRYPOINT java -jar target/vttp5_ssf_day05l-0.0.1-SNAPSHOT.jar