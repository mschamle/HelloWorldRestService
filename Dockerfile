FROM payara/micro:5.2021.3-jdk11
COPY target/HelloWorldRestService.war $DEPLOY_DIR
EXPOSE 4848
EXPOSE 8080

