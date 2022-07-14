# emp rolodex Spring Boot Data REST service


# About

The spring-boot-starter-data-rest has been added, as a result - (custom) methods have been deleted.
Rejection of the controller and service. Spring will be responsible for mapping.
Spring realizes best practices:

HTTP Method | URL | CRUD operation
------ | ------ | ------
GET   |employees   | Getting all employees
GET   |employees/{employeeId}   | Getting one employee
POST   |employees   | Adding an employee
PUT   |employees/id   | Changing employee
DELETE   |employees/{employeeId}   | Deleting an employee

APIs are created by default when using spring data rest.
