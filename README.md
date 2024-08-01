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
http://localhost:9090/visitor/{visitorId}		DELETE		- DELETE A SINGLE VISITOR
http://localhost:9090/visitor/search/{vistorName}	GET		- GET VISITOR(S) NAME
http://localhost:9090/visitor/search/{purpose}		GET		- GET VISITOR(S) NAME

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



	