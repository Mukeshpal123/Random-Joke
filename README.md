# Random-Joke
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>

<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/Maven-3.0.6-brightgreen.svg" />
</a>

</center>

The random-joke project is a Spring Boot application that provides a RESTful API for retrieving random jokes. It allows users to access a random joke by making a GET request to the appropriate endpoint. The application uses a predefined set of jokes and selects a random joke from the collection to return as the response.
---
<br>

## Framework Used
* Spring Boot

---
<br>

## Dependencies
The following dependencies are required to run the project:

* Spring Boot Dev Tools
* Spring Web
* Lombok

## Language Used
* Java

---
<br>

## Data Model

The joke data model is defined in the joke class, which has the following attributes:
<br>

* todo Model
```
id : Integer;
content : String;
```

## Data Flow

1. The joke at client side sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the appropriate controller method.
3. The controller method returns a response to the API.
4. The API sends the response back to the joke.

---

<br>


## API End Points 

The following endpoints are available in the API:

* Joke Controller:
```
GET /random-joke: read random joke 
```


<br>

## DataBase Used

```
We have used Arraylist database to implement CRUD Operations.
```
---
<br>

## Project Summary

Overall, the random-joke project provides a simple and lightweight way to retrieve random jokes through a RESTful API. It showcases the usage of Spring Boot's controller functionality, HTTP request handling, and the generation of random responses. This project can serve as a starting point for more complex applications involving joke generation, database integration, or further expansion of the joke-related functionalities.

## 📝 Licence
---
Copywrite © 2019 [Mukesh]().

This project is [Geekster]() Licensed.
 
---
_This README was generated with ❤️  by [readme-github]()_
