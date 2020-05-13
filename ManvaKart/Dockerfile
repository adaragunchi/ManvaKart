#Base image
FROM openjdk:8

#Adding the jar file to container
ADD target/ManvaKart-0.0.1-SNAPSHOT.jar manvaKart.jar

#Exposing the port
EXPOSE 8121

#Command need to excute
CMD ["java","-jar","manvaKart.jar"]