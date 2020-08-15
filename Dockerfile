FROM java:8-jdk-alpine

MAINTAINER shivangiPandey



COPY target/springboot-first-web-application-0.0.1-SNAPSHOT.war /usr/
WORKDIR /usr
RUN sh -c 'touch springboot-first-web-application-0.0.1-SNAPSHOT.war'
ENTRYPOINT ["java","-jar","springboot-first-web-application-0.0.1-SNAPSHOT.war"]


EXPOSE 9990
