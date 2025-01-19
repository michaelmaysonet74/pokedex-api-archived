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
    git clone https://github.com/michaelmaysonet74/poke-dex-api.git
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

- Get Pokemon by ID
    - URL: `/api/v1/pokemon/{id}`
    - Method: `GET`
    - Description: Fetches information about a Pokemon by its ID.

- Get Pokemon by Name
    - URL: `/api/v1/pokemon?name={name}`
    - Method: `GET`
    - Description: Fetches information about a Pokemon by its name.

### Example Requests

- Fetch Pokemon by ID:

  `curl -X GET "http://localhost:8080/api/v1/pokemon/25"`

- Fetch Pokemon by Name:

  `curl -X GET "http://localhost:8080/api/v1/pokemon?name=Pikachu"`

## GraphQL Support

This project also includes support for GraphQL.

### GraphQL Endpoint

- URL: `/graphql`
- Method: `POST`
- Description: Endpoint to handle GraphQL queries.

### Example GraphQL Queries

- Query Pokemon by ID:

```gql
query {
  pokemonById(id: 25) {
    id
    name
    type
    abilities
    # Add more fields here
  }
}
```

- Query Pokemon by Name:

```gql 
query {
  pokemonByName(name: "Pikachu") {
    id
    name
    type
    abilities
    # Add more fields here
  }
}
```
