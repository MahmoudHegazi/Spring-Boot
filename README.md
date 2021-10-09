# Spring-Boot

#### Start

1. Create project
https://start.spring.io/

2. Download Java SDK and install then download IntelliJ and install
3. [IntelliJ] set SDK File -> project structure [SDK] and Language Level
4. right click on main class ```projectTitleApplication.java``` and select ```run```


### notes
##### all properties config
1. https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html
2. default user and password for spring secuirty , user and password logged in the console.
3. how to add react with spring boot https://www.bezkoder.com/integrate-reactjs-spring-boot/ 
4. Build and run the Spring Boot server with commands:
* mvn clean install
* mvn spring-boot:run

### some config

```
# config ssl
server.ssl.enabled=true
server.ssl.protocol=TLS

# config database and credentials
spring.datasource.url=jdbc:postgres://localhost:5432
spring.datasource.username=admin
spring.datasource.password=password
```
