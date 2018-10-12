# spring-data-rest-app

1.  The JpaRepository->PageAndSortingRepository->CrudRepository
2.  By default the Page element has a size of 20 elements
3.  We can pass a size parameter with a value for the number of elements we need like size=5 or 6 etc
4.  To sort the results pass a sort parameter with field and order of sort like : sort={field of entity to sort},asc/desc
5.  For all custom query methods in the repository we expose endpoints with /search which supports only GET methods
6.  All the 3 microservices would use the default testdb of H2 with user name as sa.
7.  Complex relationships between entities
    1.  A person can own 0 or many applications while an application can be owned by 1 person
    2.  Sharing in Microservices using Synchronous lookup where a application has a owner represented by owner id. To get the details of owner from user management service we get the owner name and role from Person table using the owner id passed by Application service from Application table
    3.  Joining the data using join in a client Vs materialising a view. Join in a client means that the client application first gets the data    from the application microservice and then query matching tickets from the ticket MC. Materializing a view keeps the data from             different tables in a view which gets updated by a service subscribed to events from the respective MC about data changes.
8. To write a custom handler
    Use @BasePathAwareController which allows us to defines a controller which takes precendence over a repository in the event both sit in the same path.
9. Using swagger UI for REST API documentation. Parts of Swagger tool
    1.  Swagger editor: Browser based editor where you can write the API specs
    2.  Swagger UI: Renders open API specs as an interactive API documentation
    3.  Swagger Codegen: Generates server stubs and client libraries from an open API spec
10. Access Swagger documentation at http://localhost:8081/swagger-ui.html


POSTMAN Requests used:
1.	http://localhost:8080/tickets
2.	http://localhost:8080/tickets?sort=title,desc
3.	http://localhost:8080/tickets?size=4
4.	http://localhost:8080/tickets/search
5.	http://localhost:8080/tickets/search/descriptionIgnoreCaseContaining?description=urgent
6.	http://localhost:8080/tickets/search/findByApplicationId?appId=4&size=2
7.	http://localhost:8082/persons
8.	http://localhost:8081/applications
