#
# Build stage
#
FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp

#
# Package stage
#
COPY target/*.jar apifit.jar
# ENV PORT=8080
ENTRYPOINT ["java","-jar","apifit.jar"]
EXPOSE 8080
