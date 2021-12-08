# Introduction

This repository has following folders under src/tet:

- **PageFactory:** Contains page object classes.
- **Runner:** Contains TestRunner class.
- **StepDefs:** Stepdef class containing the glue code for the feature file.
- **resources/features:** Contains feature files.

## Run RestAssuredTest
### Tools Used:
- Java
- Maven
- Cucumber BDD
- Serenity
- JUnit
- Selenium

### How to Run
- Clone the repository.
- Run following commands:<br />
mvn clean install -DskipTests <br />
mvn verify
- Serenity Report is generated at /target/site/index.html

