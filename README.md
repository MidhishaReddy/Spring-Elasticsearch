# Spring-Elasticsearch
Connecting Springboot with Elasticsearch
Design a logging Framework

1.Prerequisites:
Language	Java 17
Framework	SpringBoot 2.2
Storage Repository	Elasticsearch 
Testing	Postman
Elasticsearch version	Elasticsearch 6.8

2. Configurations and Dependencies: 

2.1. Elasticsearch configuration:
1.	Download elasticsearch.
2.	Make changes to the elasticsearch.yaml file
 
2.2 Running Elasticsearch
Once the file is extracted, run the elasticsearch (run the batch file in the bin folder) 

3.	SpringBoot Dependencies:

3.1 Pom.xml
a. Spring-boot-starter-data-elasticsearch: Helps connecting the springBoot with elasticsearch and its repository. RESTful search and analytics engine with Spring Data Elasticsearch.
b. Spring-boot-starter-web: Helps build web, including RESTful, applications using Spring MVC.
c. Lombok: Helps create automatic getters and setters.
  
3.2 applications.properties:
I set this file with properties like the cluster name below to match with the changes made to the elasticsearch.yaml file.

4. Packages:
4.1. Building document model:
a. Model: customer.java: is a simple java class to create the parameters related to Json sample data:
 
4.2 Repository package: repository.java: This is an interface that extends the Elasticsearch Repository.
 		
4.3	The Controller file: SpringBootElasticserachExampleApplication :This contains the GET and POST API’s. This class is linked to the repository.
 

5.	API Usage:

5.1	@PostMapping: This API saves all the records entered in the Json file and saves it in the elasticsearch repository. Access this API using (“/saveCustomer”)
5.2	@GetMapping: This API is used to extract the saved records from the repository.
a.	{“/findAll”} returns all the record details saved in the elasticsearch repository.
b.	{“/findByFName”} returns the record with a specific name. Just in case we have names with same firstname in different cases, it returns both the names and its related details from the elasticsearch repository.

6.Postman results:
6.1	POST command: Three records were passed and the Elasticsearch repository replies with status code and the number of records that were stored.
http://localhost:8089/saveCustomer

6.2	GET command: The get command with /findAll API fetch all the records from the elasticsearch repository. Along with the records the response also has details relating to the elasticsearch pagination (image below.)
http://localhost:8089/findAll

6.3	Pagination details in response from the elasticsearch repository:
 
