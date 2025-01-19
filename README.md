# poke-dex-api

API that allows users to fetch a pokemon information by their name or id.

## Table of Contents

- [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [Installation](#installation)
    - [Running the Application](#running-the-application)
- [API Endpoints](#api-endpoints)
- [Example Requests](#example-requests)
- [GraphQL Support](#graphql-support)
    - [GraphQL Endpoint](#graphql-endpoint)
    - [Example GraphQL Queries](#example-graphql-queries)

## Getting Started

### Prerequisites

- Java 21 or higher
- Gradle

### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/yourusername/poke-dex-api.git
    ```
2. Navigate to the project directory:
    ```sh
    cd poke-dex-api
    ```
3. Build the project:
    ```sh
    ./gradlew build
    ```

### Running the Application

To run the application, use the following command:
```sh
./gradlew bootRun
```
The application will start on http://localhost:8080.

## API Endpoints

- Get Pokemon by Name  
  - URL: /pokemon/name/{name}
  - Method: GET
  - Description: Fetches information about a Pokemon by its name.

- Get Pokemon by ID  
  - URL: /pokemon/id/{id}
  - Method: GET
  - Description: Fetches information about a Pokemon by its ID.

### Example Requests

- Fetch Pokemon by Name:

    `curl -X GET "http://localhost:8080/pokemon/name/pikachu"`


- Fetch Pokemon by ID:
   
  `curl -X GET "http://localhost:8080/pokemon/id/25"`

## GraphQL Support
This project also includes support for GraphQL, allowing for more flexible and efficient queries.

### GraphQL Endpoint

- URL: /graphql
- Method: POST
- Description: Endpoint to handle GraphQL queries.

### Example GraphQL Queries

- Fetch Pokemon by ID:
```gql
{
  pokemonById(id: 25) {
    id
    name
    type
    abilities
    # Add more fields here
  }
}
```

- Fetch Pokemon by Name:  
```gql 
{
  pokemonByName(name: "pikachu") {
    id
    name
    type
    abilities
    # Add more fields here
  }
}
```
