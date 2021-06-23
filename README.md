## HelloWorldRestService ##
### Description ###
Barebones JEE service with two endpoints:
/HelloWorldRestService/hello - return HelloWorld
/HelloWorldRestService/hello/{name} - return Hello {name}


### Deploy/Run (Application server) ###
Build application (mvn package) and deploy HelloWorldRestService.war to an application server

Example using payara5 micro
1. download payara micro community edition to project root: https://www.payara.fish/downloads/payara-platform-community-edition/
1. run app from project root folder using (rename micro if needed) `java -jar payara-micro.jar --deploy target/HelloWorldRestService.war`
1. access at: http://localhost:8080/HelloWorldRestService/hello

### Deploy/Run using docker ###
Prerequisite: docker (linux) or docker desktop (windows)
Java 11 compatible - if you want to build under another version you will need to change the payara image version used in
the Dockerfile

1. build image `docker build -t helloworld .`
1. run image `docker run -p 8080:8080 helloworld`
1. access at: http://localhost:8080/HelloWorldRestService/hello

* make sure you don't have another running application server at this port


