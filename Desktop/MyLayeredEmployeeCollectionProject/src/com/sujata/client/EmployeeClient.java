package com.sujata.client;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sujata.presentation.EmployeePresentation;
//import com.sujata.presentation.EmployeePresentationImpl;

public class EmployeeClient {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
//		EmployeePresentation employeePresentation=new EmployeePresentationImpl();
		
		//launched SpringContainer by instantiating AnnotationConfigApplicationContext:
		AnnotationConfigApplicationContext springContainer = new AnnotationConfigApplicationContext(EmployeeConfiguration.class);
		
        //call getBean() method to pick different objects, those are created by Spring Container
		EmployeePresentation employeePresentation=(EmployeePresentation)springContainer.getBean("empPresentation");
		
		while(true) {
			employeePresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			employeePresentation.performMenu(choice);
		}

	}

}


//Steps for Spring IOC Project
//1. Create Java Project
//2. Convert Java Project to Maven
//3. add spring context dependency in pom.xml
//4. create component
//5. create configuration file
//6. launched SpringContainer by instantiating AnnotationConfigApplicationContext
//7. call getBean() method to pick different objects, those are created by Spring Container
//
//
//===============================================
//
//Spring says : Need not to create objects by yourself,
//springContainer ( Object of AnnotationConfigApplicationContext) will create object for you, How?
//Spring Container need a configuration file
//Configuration file is a Java Class which is annotated with an Annotation @Configuration
//Inside that class we create public method to return the object
//All methods will be annotated with @Bean inside configuration class, will be called by Spring Container and those  objects will be recognised by the name specified with name attibute of @Bean Annotation like this @Bean(name="object Name")
//
//How we can use the objects created by Spring Container
//Launch SpringContainer by instantiating AnnonationConfigApplicationContext(ConfigurationFile)
//call getBean("ObjectName") method of AnnotationConfigApplicationContext