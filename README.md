# ScholarMatch System

A Java Swing desktop application for managing scholarship information and matching student academic profiles against predefined, rule-based eligibility criteria.

## Project scope

- Student registration and login
- Student academic profile management
- Scholarship search, filtering, and details
- Rule-based eligibility results, including unmet criteria
- Administrator management of scholarships, criteria, and deadlines
- Input validation, role-based access, and hashed passwords
- Software Quality Engineering artefacts, testing, defect tracking, and quality metrics

Out of scope: external scholarship submissions, payments, external APIs/platform integrations, web scraping, document verification/uploads, email/SMS notifications, and AI/ML recommendations.

## Technology

- Java
- Java Swing
- MySQL
- Maven
- JUnit 5
- GitHub

## Getting started

1. Install JDK 17+ and Maven.
2. Create a MySQL database using `database/schema.sql`.
3. Copy `src/main/resources/db.properties.example` to `db.properties` and configure local credentials. Do not commit real credentials.
4. Run `mvn test` to execute unit tests.
5. Run `mvn package` to build the application.

Implementation is being developed incrementally. See `docs/` for requirements and SQE planning artefacts.