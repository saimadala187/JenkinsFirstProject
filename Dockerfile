FROM openjdk:21-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the JAR file from the target folder to the container
COPY target/jenkinsCICD.jar app.jar

# Expose the application port
EXPOSE 8083

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]