FROM maven:3-jdk-8

COPY . /source
WORKDIR /source
RUN mkdir /app && \
    mvn clean -DskipTests=true package && \
    cp target/application.jar /app/application.jar
    
EXPOSE 8080
CMD ["java", "-jar", "/app/application.jar"]