# Intelligent Ticket Dashboard

Backend foundation for an enterprise IT support dashboard that exposes open-ticket summaries through a clean REST API. The project demonstrates layered Spring Boot architecture and Oracle-backed ticket retrieval for operational reporting.

## Current capabilities

- Retrieves open support tickets from an Oracle database
- Maps persistence entities to concise ticket-summary responses
- Exposes ticket data through a versioned REST endpoint
- Separates controller, service, repository, DTO, and domain concerns
- Includes a Spring Boot application test foundation

## Tech stack

- Java 21
- Spring Boot 3.5
- Spring Web
- Spring Data JPA
- Spring Modulith
- Oracle JDBC
- Maven

## API

### List open tickets

`GET /api/v1/tickets`

Returns a JSON array of open-ticket summaries.

## Project structure

- `controller/` — REST endpoints
- `service/` — application logic and entity-to-DTO mapping
- `repository/` — database access
- `model/` — ticket persistence model
- `dto/` — API response contracts

## Run locally

### Prerequisites

- Java 21
- Access to an Oracle database containing the expected ticket schema

Configure the datasource for your environment without committing credentials, then run:

```bash
cd backend
./mvnw spring-boot:run
```

On Windows, use `mvnw.cmd spring-boot:run`.

## Roadmap

- Add dashboard visualizations and operational metrics
- Expand automated tests for service and API behavior
- Add filtering, pagination, and ticket-status analytics
- Add deployment and CI configuration

## Author

Built by [Abdullahi Zubair](https://github.com/yabdev) as an enterprise application engineering portfolio project.
