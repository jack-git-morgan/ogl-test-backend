# OGL Software Developer Test
Your tasks will involve extending the backend services and consuming them using
a frontend web framework (e.g. React/VueJS/Angular) of your choice.

The backend services use Spring Boot with Spring Web MVC, Spring Data JPA and an H2 embedded database.

You should have JDK 11 installed on your machine, we recommend: https://adoptopenjdk.net/.

The database structure is discarded when the services are stopped and rebuilt from
`src/main/resources/schema.sql` and `src/main/resources/data.sql` when started.

## Running the Backend
### Via IDE
Using IntelliJ Idea Ultimate, VSCode, Netbeans, Eclipse etc.

### Via Terminal
Compile
```shell script
./mvnw clean package
```

Run
```shell script
./mvnw spring-boot:run
```
The backend will now be available to consume from http://localhost:8080.

## Submission
Package all your sources into a zip or tarball with instructions on how
to run your frontend.

## Tasks
### 1. Checkout
Clone this repository using git.

### 2. List Customers
*As a user I want to view a list of all my customers.*

Hint: you will need a controller and repository class.

### 3. Add Extra Fields to Customer
*As a user I would like to see my customer's addresses.*

An address should include a street, city, county and postcode.

### 4. Creating New Customers
*As a user I would like to be able to add a new customer.*

Provide a form to create a new customer with the ability to populate all
fields.

### 5. Editing Existing Customers
*As a user I would like to be able to update the details of my existing customers.*

Provide a form to edit an existing customer.

### 6. Plot Customers on a Map
*As a user I would like to see a map with markers for all my customers based on their postcode.*

Use a third party API mapping tool.

### 7. Filtering Customers on the Map
*As a user I would like to filter the customers plotted on the map by their postcode.*

Provide a facility to limit the plots on the map based on an inputted postcode.