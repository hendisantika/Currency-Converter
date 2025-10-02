# Currency Converter

A Simple Currency Converter built with Spring Boot

## Requirements

- **JDK 21 LTS** (recommended for production)
- Gradle 8.13 or higher
- Spring Boot 3.5.6

## Building the Project

To build the project using Gradle:

```bash
./gradlew clean build
```

## Running the Application

```bash
./gradlew bootRun
```

Or run the JAR file after building:

```bash
java -jar build/libs/Currency-Converter-0.0.1-SNAPSHOT.jar
```

## JDK Compatibility Notes

### Supported JDK Versions

- ✅ **JDK 21 LTS** - Fully supported and recommended
- ✅ **JDK 17 LTS** - Supported
- ⚠️ **JDK 25** - Experimental support (Lombok compatibility issues with Gradle)

### JDK 25 Status

JDK 25 (released September 2025) is supported at the language level, but current build tooling has limitations:

- Gradle 8.13 has partial JDK 25 support
- Lombok 1.18.36 has initialization issues with JDK 25
- For production use, JDK 21 LTS is recommended until tooling matures

To use JDK 21, set your JAVA_HOME:

```bash
export JAVA_HOME=/path/to/jdk-21
./gradlew clean build
```

## Technologies Used

- Spring Boot 3.5.6
- Spring Web
- Lombok 1.18.36
- Java 21
- Gradle 8.13