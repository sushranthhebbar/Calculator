FROM openjdk:8-jdk
MAINTAINER Sushranth Hebbar (sushranthhebbar@gmail.com)
RUN apt-get update
RUN apt-get install -y maven
COPY src /usr/local/service/src
COPY pom.xml /usr/local/service/pom.xml
WORKDIR /usr/local/service
RUN mvn package
#CMD ["java","-cp","target/Calculator-1.0-SNAPSHOT.jar", "Calculator"]
CMD java -cp target/Calculator-1.0-SNAPSHOT.jar Calculator