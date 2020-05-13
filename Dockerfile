From openjdk:8
copy ./target/EmployeeMicroservice-0.0.1-SNAPSHOT.jar EmployeeMicroservice-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","EmployeeMicroservice-0.0.1-SNAPSHOT.jar"]