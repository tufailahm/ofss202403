"# ofss202403" 

https://github.com/tufailahm/ofss202403

<h2>
<pre>

Jenkins.war	https://www.jenkins.io/download/
Postman
Git		https://git-scm.com/downloads
Maven		https://dlcdn.apache.org/maven/maven-3/3.9.8/binaries/apache-maven-3.9.8-bin.zip	- just unzip
Rancher		https://rancherdesktop.io/		- Just download
Node js		https://nodejs.org/dist/v20.16.0/node-v20.16.0-x64.msi
Postgres		https://www.enterprisedb.com/downloads/postgres-postgresql-downloads
Dbeaver		https://dbeaver.io/download/

*In Dbeaver , please give the password as root

</pre>
</h2>	



What is Spring ?

Framework
IOC	- Inversion of control
DI	- Dependency injection


public class Message
{
	public String getMessage()
	{
		return "Welcome OFSS";
	}
}




Message m ;
m.getMessage();




JSON
REST



alstrom-banking-app

Your name : digi-banking-app


Two ways :

1) Download jar file and attach it your project




Spring Boot
=============

Zero configuration
Embedded tomcat		default	port 8080



REST
================================================================

Web Service


Amazon(app)	request			JSON response--app (one plus)


JSON - 
{

}



http:localhost:9090/visitors/message
					



Hands on : Create a rest endpoint to return your full name

http://localhost:9090/myintro

Output : Hi I Am Mohammad Tufail Ahmed




http://localhost:9090/todaysmessage


Sterotype annoation
@Component	- POJO/MODEL/UTILITY
@Bean
@Qualifier
@Autowired
@Configuration	


https://codeshare.io/tufail

Hands on : Use the below class RandomNumberGenerator to create the following rest endpoint to return random visitor id

http://localhost:9090/getvisitorid

package com.training.utility;

import java.util.Random;

public class RandomNumberGenerator {

	public String generateNumber() {
		// create instance of Random class
		Random random = new Random();

		// Generate random integers in range 0 to 999
		int rand_int1 = random.nextInt(10000);

		return "V00-"+rand_int1+"-2024";

	}
}

Points to follow :
We should not use new keyword to create instance of RandomNumberGenerator 
Use @Autowired annotation


Rest API

CRUD 



Visitor	- class
	int visitorId
	String visitorName
	String mobileNumber
	String purpose


Way 1 :

http://localhost:9090/createVisitor		Visitor
http://localhost:9090/deleteVisitor/{1918}
http://localhost:9090/modifyVisitor		Visitor
http://localhost:9090/getAllVisitors	
http://localhost:9090/getVisitorById/{1918}	


Way 2:

					HTTP METHODS

http://localhost:9090/visitor				GET		- GET ALL VISITORS
http://localhost:9090/visitor/{visitorId}		GET		- GET A SINGLE VISITOR
http://localhost:9090/visitor				POST		- CREATE A VISITOR 
http://localhost:9090/visitor				PUT		- UPDATE A VISITOR 
http://localhost:9090/visitor/{visitorId}/{newMobileNumber} PUT	- 	UPDATE A VISITOR 
http://localhost:9090/visitor/{visitorId}		DELETE		- DELETE A SINGLE VISITOR
http://localhost:9090/visitor/mobilenumber/{mobileNumber}		DELETE		- DELETE A SINGLE VISITOR
http://localhost:9090/visitor/search/{vistorName}	GET		- GET VISITOR(S) NAME
http://localhost:9090/visitor/search/purpose/{purpose}	GET		- GET VISITOR(S) NAME
http://localhost:9090/visitor/mobilenumber/{mobileNumber}	GET		- GET VISITOR BY MOBILE NUMBER

http://localhost:9090/visitor/search/Neha	- POST			- METHOD NOT ALLOWED(405)


Hands  on


1) Create model class Customer

customerId
customerName
mobileNumber
balance


http://localhost:9090/customer


2) Please prepare endpoints for below url

http://localhost:9090/customer


15 minutes


10 minutes
-----------------
localhost:9090/visitor			- It should print three visitors
localhost:9090/visitor/191			- It shoud print hello





return products.stream().filter(t -> t.getProductId() == (productId)).findFirst().get();


products.add(product);


for(int i=0;i<products.size();i++){
Product p = products.get(i);
if(p.getProductId().equals(productId)){
products.set(i, product);

products.removeIf(t -> t.getProductId().equals(productId));



Swagger
=============

Documentation for REST APIS

pom.xml

<dependency>
			<groupId>org.springdoc</groupId>
			<artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
			<version>2.5.0</version>
		</dependency>


Save and close pom.xml

http://localhost:9090/swagger-ui/index.html




======================================

Status Codes in Rest

GET/1019
200	 - OK
204	- NO_CONTENT


Saving	- POST
	
201	- CREATED
409	- CONFLICT
500	- INTERNAL SERVER
400	- BAD REQUEST



========================================

CI/CD


jenkins.war
download and install git
download and unzip maven








# DevOps

DevOps is a blend between CS and IT. 

To start off, the term "DevOps" comes from the combination of two teams: Development and Operations.

The Development team focused on developing an application. They are interested in creating new features to be used by the end users.

The Operations team were the IT part, focusing on the production environment, and making sure that the application that was developed is actually available to the end users.

Historically, there has been a lot of friction between Development and Operations teams. The Development team wants rapid changes and high velocity, whereas the Operations team wants a static production environment to reduce the chances of any change dropping the availability of the application.

Due to this difference in perspective, Operations teams tended to enforce miscellaneous requirements on the Development team, which lead to poor programmming practices, such as feature flags/switches, amongst others.

This can lead to some unforseen issues.

When combined with manual deployment processes that are prone to human error, to lead to massive outages and losses of money.

DevOps has the three practices: CI/CD/CD to _automate_ our deployment processes to be as free from human error as possible.

- Continuous Integration
    - The practice of frequently (multiple times a day) merging multiple developers code together
    - Prevents smaller errors/issues from piling up
    - Solve issues when they are still small
- Continuous Delivery
    - Automating the deployment process, so that each commit will be tested and prepared for deployment
        - As well as any other step that you want to be part of the process or "pipeline"
    - The release is ready "at the push of a button"
        - The developers do not have to take any action to deploy the new release/version, aside from effectively hitting a button
    - Involves big "release days"
- Continious Deployment
    - Relates to the "Facebook Model"
    - Every change/commit that successfully passes every stage of the Continuous Delivery Pipeline (listed above) will immediately be released, without waiting for any approval/button press
        - Similar to Continuous Delivery, except even the "button press" is additionally automated
    - With this fully automated process, it becomes more beneficial to push changes very frequently, as you can feedback from your customer as soon as possible

## Continuous Delivery vs Continuous Deployment

For Continuous Delivery, we want each of our commits/pushes to go through a series of steps of what we call a "pipeline". Each step will consist of something like testing, code quality analysis (sonarcloud), amongst a variety of others.

At the end of our pipeline, we should prepare our release, so that the only action we need to take to fully release this change is with a very simple action. It could be, responding to a prompt (yes/no). It could be executing a script. It could be sending an HTTP Request, or any other variety of action. But the key characteristic, is that this action has no complexity to it. There is easy way for human error to prevent this from functioning as expected.

For Continuous Deployment, we want to not have any interaction with the system or pipeline in order to allow this release to occur. We want to design the system to make its own decisions about the release process. For example, it could just automatically assume the prompt is "yes". It could automatically execute the script, etc.

Continious Deployment will have every change that successfully passes through the pipeline immediately deployed, without human interaction.
This is not to say that Continuous Deployment cannot have human interaction. It is perfectly reasonable (and even suggested) that you can have abort methods. We should have the ability to interrupt the system if needed. But generally speaking, it will operate without human interaction.

## Why would we want Continuous Deployment?

It is perfectly reasonable to point out that Continuous Deployment might lead to higher issues with the production system. The benefits are in terms of velocity of release and the immediacy of user feedback to changes of the system.



What is Jenkins ?

10 minutes


