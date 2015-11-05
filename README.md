Goal
====
Produce a simple web-app backend to complement the supplied front-end code.

Mandatory Work
--------------
Fork this repository. Starting with the provided HTML, CSS, and JS, create a Java-based REST API that:

1. Saves expenses as entered to a database.
2. Retrieves them for display on the page. 
3. Add a new column to the table displaying the VAT amount for each expense.
4. Alter the README to contain instructions on how to build and run your app.

VAT is the UK’s sales tax. It is 20% of the value of the expense, and is included in the amount entered by the user.

Give our account `alchemytec` access to your fork, and send us an email when you’re done. Feel free to ask questions if anything is unclear, confusing, or just plain missing.

Extra Credit
------------
Calculate the VAT client-side as the user enters a new expense, before they save the expense to the database.

Questions
---------
##### What frameworks can I use?
That’s entirely up to you, as long as they’re OSS. We’ll ask you to explain the choices you’ve made. Please pick something you're familiar with, as you'll need to be able to discuss it.

##### What application servers can I use?
Anyone you like, as long as it’s available OSS. You’ll have to justify your decision. We use dropwizard and Tomcat internally. Please pick something you're familiar with, as you'll need to be able to discuss it.

##### What database should I use?
MySQL or PostgreSQL. We use MySQL in-house.

##### What will you be grading me on?
Elegance, robustness, understanding of the technologies you use, tests, security. 

##### Will I have a chance to explain my choices?
Feel free to comment your code, or put explanations in a pull request within the repo. If we proceed to a phone interview, we’ll be asking questions about why you made the choices you made. 

##### Why doesn’t the test include X?
Good question. Feel free to tell us how to make the test better. Or, you know, fork it and improve it!

Prerequisites 
-------------
1. Package manager npm must be installed.
2. Jdk 1.8
3. Maven 3

Installation Instructions
-------------------------
1. Make sure you have already installed the dependencies declared in file <PROJECT_ROOT>/src/main/resources/assets/package.json. If not, install them with npm.
2. Execute default gulp task with gulp command in directory <PROJECT_ROOT>/src/main/resources/assets. It will create build directory.
3. Execute mvn package from the project root.
4. In order to run the server, execute the following command from the project root: java -jar target/backend-coding-challenge-0.0.1-SNAPSHOT.jar server src/main/resources/config.yml
5. Access to http://localhost:8080
