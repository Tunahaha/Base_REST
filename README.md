# Spring Boot CRUD Application

## Introduction
This is a Spring Boot CRUD application for managing student schedules and grades. The application provides basic functionality for creating, reading, updating, and deleting student schedules and grades.

## Tech Stack
- Spring Boot
- Spring Data JPA
- MySQL Database
- Thymeleaf
- Gradle

## Quick Start
1. First, you need to install Java, Gradle, and MySQL. If you haven't installed them yet, please refer to the following links:
   - [Install Java](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
   - [Install Gradle](https://gradle.org/install/)
   - [Install MySQL](https://dev.mysql.com/downloads/installer/)
2. Clone this repository to your local machine:
    ```
    git clone [https://github.com/your-repository/spring-boot-crud.git](https://github.com/Tunahaha/Base_REST.git)
    ```
3. Switch to the directory of the repository you just cloned:
    ```
    cd Base_REST
    ```
4. Run the application using Gradle:
    ```
    ./gradlew bootRun
    ```
5. Open your browser and navigate to `http://localhost:8080`

## Features
- **Create Student Schedules and Grades**: Users can add new student schedules and grades to the system.
- **Read Student Schedules and Grades**: Users can view a list of all student schedules and grades in the system.
- **Update Student Schedules and Grades**: Users can update the schedules and grades of existing students.
- **Delete Student Schedules and Grades**: Users can delete student schedules and grades from the system.

## Database
This application uses the MySQL database. Before starting, make sure you have created the appropriate database on your MySQL server and updated the database connection details in the `application.properties` file.
