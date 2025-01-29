# Spring Boot REST API for Matches, Performances, Players, and Teams

This project is a REST API built using Spring Boot. It manages four main entities: `matches`, `performances`, `players`, and `teams`. The API supports CRUD operations (Create, Read, Update, Delete) for each entity.

## Features
- CRUD operations for all entities:
  - **Matches**
  - **Performances**
  - **Players**
  - **Teams**
- Layered architecture:
  - **Controller**: Defines the routes.
  - **Service**: Contains the business logic.
- Integrated with Postman for API testing (screenshot included).

## API Endpoints
Each entity has the following routes:

### Matches
- `GET /matches` - Get all matches
- `GET /matches/{id}` - Get a match by ID
- `POST /matches` - Add a new match
- `PUT /matches/{id}` - Update a match
- `DELETE /matches/{id}` - Delete a match

### Performances
- `GET /performances` - Get all performances
- `GET /performances/{id}` - Get a performance by ID
- `POST /performances` - Add a new performance
- `PUT /performances/{id}` - Update a performance
- `DELETE /performances/{id}` - Delete a performance

### Players
- `GET /players` - Get all players
- `GET /players/{id}` - Get a player by ID
- `POST /players` - Add a new player
- `PUT /players/{id}` - Update a player
- `DELETE /players/{id}` - Delete a player

### Teams
- `GET /teams` - Get all teams
- `GET /teams/{id}` - Get a team by ID
- `POST /teams` - Add a new team
- `PUT /teams/{id}` - Update a team
- `DELETE /teams/{id}` - Delete a team

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- MySQL (Database)

## Installation & Running the Project
1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/your-repo.git
   ```
2. Navigate to the project directory:
   ```sh
   cd your-repo
   ```
3. Build the project:
   ```sh
   mvn clean install
   ```
4. Run the application:
   ```sh
   mvn spring-boot:run
   ```

## Postman Testing
![image](https://github.com/user-attachments/assets/19e2ce6a-d149-444b-84f1-0bef70d17102)


Enjoy coding! 🚀
