FROM openjdk:8-jre
RUN mkdir /app
COPY ecshop-helper-0.0.1-SNAPSHOT.jar /app/
CMD java -jar /app/ecshop-helper-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod
EXPOSE 8080
