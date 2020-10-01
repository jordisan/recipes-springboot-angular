# recipes-springboot-angular

Recipes basic application. **Automatically deployed to https://recipes-client-angular.herokuapp.com/**

- [**Server** (/recipes-api)](recipes-api) using Spring Boot 2.3.4
- [**Client** (/recipes-client)](recipes-client) using Angular 10

## Notes

- **Some tests included:** more integration than unit testing because logic is very simple and errors are expected to come from integration between components/layers.
- No database (uses in-memory H2)
