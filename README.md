# PhoneApp

Example app (microservice) based on Spring Webflux (Project Reactor) to retrieve a catalog and post an order.

There should have been two different microservices but this approach is simpler. However, the orders business logic uses a REST call to retrieve the catalog as if they were two separate microservices.

## Endpoints
 * GET: /phone
 * POST: /order
 
## Example cURLs

### Retrieve the entire catalog
`curl --location --request GET 'localhost:8081/phone'`

### Post an order
`curl --location --request POST 'localhost:8081/order' \
 --header 'Content-Type: application/json' \
 --data-raw '{
     "customerName": "Yo",
     "customerEmail": "yo@yo",
     "customerSurname": "pseudoyo",
     "phoneIds": [
         1, 2
     ]
 }'`
 
## How to run
If you have Docker installed in your system, you can simply run `./run.sh` and it will automatically run the app. Note that the container is NOT running in daemon mode.

Despite Docker container can be natively built since Spring Boot 2.3.0, it is not fully compatible yet so it's mandatory to define the Dockerfile.

If you want to run the app in your system, execute `mvn spring-boot:run`

## Code coverage
* Class: 95%
* Method: 94%
* Line: 92%

It should be improved by using Wiremock in `CatalogClient.java`.
 
## Points to improve

To simplify the app, these following points have been excluded:

* There is no database. The app should have a, for example, MongoDB to store the documents.
* There are no validations in the POST request.
* There is no error handling.