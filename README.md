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



@Component
@Bean
@Qualifier
@Autowired



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



























	