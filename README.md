# SpringBootGetPostDemo

#Usage :

	Run the application and go on http://localhost:8080/appliances
	Enter the username and password for authentication when prompted


#Use the following URLs to invoke controllers methods and see the interactions with the database:

		API Endpoint : /appliances/insert : Create a new appliance with an auto-generated appliance_id and 
						model_number, serial_number, brand and category as passed values.
		Method : POST
		RequestBody Sample : {
				"modelNumber":"WPR123",
				"serialNumber":"123456",
				"brand":"Whirlpool",
				"category":"Microwave"
				}
		Authorization : Basic Auth :
				username :
				password :

		API Endpoint : /appliances : Retrieve all the appliances information from the database
		Method : GET
		Authorization : Basic Auth :
				username :
				password :

#Build and run :
	
	Open the application.properties file and set your own configurations for the database connection if needed.

#Prerequisites :

	Java 7
	Maven 3+
	Postman
	
#From terminal :

	Go on the project's root folder, then type: $ mvn spring-boot:run
	
#From Eclipse (Spring Tool Suite) :


Import as Existing Maven Project and run it as Spring Boot App.
