# esg-console

## Tech stack
- Java 21
- Apache HTTP
- OpenCSV
- GSON

App reads from a CSV file whose location is configurable. Maps data to customer model.
This is then translated to JSON and posted to the POST endpoint within the ESG API.

The prop file contains the properties for DB connection and currently connects to a local MySQL server on port 3306.
It expects the esg schema and will auto-generate the customer table and keeps track of the ID primary key.

## Time-boxed exercise

With additional time, unit testing would have been done with Junit 5.
Logging capabilities and bespoke exception handling.