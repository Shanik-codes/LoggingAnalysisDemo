# Use official OpenJDK image
FROM openjdk:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy the compiled JAR file from the target directory
COPY target/LoggingAnalysisDemo-1.0-SNAPSHOT-jar-with-dependencies.jar myapp.jar

# Run the application
CMD ["java", "-jar", "myapp.jar"]
