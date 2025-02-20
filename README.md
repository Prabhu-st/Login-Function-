Login Automation with Selenium

Description

This project automates the login process for a web application using Selenium WebDriver in Java. It fills in the login form with a name, email, and password, then clicks the login button and verifies successful login.

Technologies Used

Java

Selenium WebDriver

ChromeDriver

Prerequisites

Install Java (JDK 8 or later)

Install Selenium WebDriver

Download ChromeDriver and set the path correctly

Setup & Installation

Clone the repository:

git clone https://github.com/your-username/repository-name.git

Open the project in an IDE (Eclipse/IntelliJ IDEA)

Add Selenium WebDriver dependencies (if using Maven, add dependencies in pom.xml)

Running the Test

Update chromedriver path in LoginTest.java

Update the driver.get("https://example.com/login") URL to the actual login page

Run LoginTest.java

Expected Output

If login is successful: "Login successful!"

If login fails: "Login failed!"


