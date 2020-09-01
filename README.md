# jacoco-demo

Springboot project with jacoco code coverage tool configured via maven plugin

## PREREQUISITES
JDK 14

## how to run

* run tests 
* measure coverage
* NO coverage check
* create report
```
$ mvn clean test && mvn jacoco:report && xdg-open target/site/jacoco/index.html 
```

* run tests 
* measure coverage
* PERFORM coverage check, fail build if coverage is less than expected
```
$ mvn clean verify; xdg-open target/site/jacoco/index.html 
```


## build docker image

with Dockerfile
```
$ docker build -t jacoco-maven-demo:0.0.1 .
```

without Dockerfile 
```
$ ./mvn spring-boot:build-image -Dspring-boot.build-image.imageName=jacoco-maven-demo:0.0.1
```