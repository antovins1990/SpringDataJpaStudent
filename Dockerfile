FROM openjdk:17-ea-oracle
ENV PORT=9090
EXPOSE 9090
WORKDIR /opt/anto
COPY ./target/*.jar /opt/anto/data-jpa.jar
ENTRYPOINT [ "java", "-jar", "/opt/anto/data-jpa.jar" ]