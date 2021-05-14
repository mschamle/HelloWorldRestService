## HelloWorldRestService ##
### Description ###
Barebones JEE service with a single endpoint that returns a static result.

### Deployment (Application server) ###
Build application (mvn package) and deploy HelloWorldRestService.war to an application server

Example payara5
1. run application server (asadmin start-domain from /bin folder)
2. open admin in browser (default http://localhost:4848 )
3. deploy in Applications

### Running Application ###
Example payara5:
run in browser: http://localhost:8080/HelloWorldRestService/hello
