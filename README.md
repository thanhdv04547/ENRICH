- Docker

~~~
docker run --name mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=1234 -d mysql
docker run --name keycloak -p 8080:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:21.1.2 start-dev
~~~

- Flyway config

~~~
build.gradle:

flyway {
url = 'jdbc:mysql://localhost:3306/enrich?createDatabaseIfNotExist=true&useSSL=false'
user = 'root'
password = '1234'
schemas = ['enrich']
cleanDisabled = false
}

buildscript {
dependencies {
classpath 'org.flywaydb:flyway-core:9.8.1'
classpath 'org.flywaydb:flyway-mysql:9.17.0'
}
}
~~~

- Application.yml config

~~~
spring -> datasource: connect DB
mybatis -> configuration: query DB
~~~