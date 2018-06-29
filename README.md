# Questionare 
This is an small task called Questionare
## Technologies used:
  * Language: **Java**
  * Development Kit: **Java SDK 8**
  * Build Automation Tool: **Maven**
  * IDE: **IntelliJ IDEA (Ultimate Edition)**

## Getting Started
These instructions will get you a copy of the project up and running on you local machine for development and testing purposes.

## Local Installation
### Prerequisites
  #### Required
   * Java SDK 8
   * Java IDE (IntelliJ IDEA recommended)
   * Git
## Installing and Running 
Please follow carefully step by step instructions below in order to get the app up and running locally.

1. Open Terminal

2. Get a clone of this project in local machine:
```
git clone https://github.com/arionitmisini/questionar.git
cd questionar/
```
3. Build project and JAR file.
```
mvn clean install
```
4. Run project with terminal
```
cd target/
java -jar questionare-1.0-SNAPSHOT.jar <Total amount> <No of payments>
```

**Note: After running the application please read the API documentation below the "Running Test Section"**
## Running Tests
Follow the instructions below in order to run automated tests.

 * Running tests with IDE:
    * Run with any IDE the "BigDecimalCalculateTest.java" file located in project location "src/test/java/utils/BigDecimalCalculateTest.java".
 * Running tests with command line:
    * Open the Terminal
    * Change directory to the project directory in terminal
    * Run the command below:
```
mvn test
```

 ## Author
  * **Arionit Misini**
