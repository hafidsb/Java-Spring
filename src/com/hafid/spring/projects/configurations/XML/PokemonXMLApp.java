package com.hafid.spring.projects.configurations.XML;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PokemonXMLApp {

	public static void main(String[] args) {
		
		// Create IOC container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("PokemonConfig.xml"); 
		
		// Get bean object
		Pokemon poke_1 = context.getBean("myPoke_1", Pokemon.class);			
		Squirtle squirtle = (Squirtle)poke_1;
		
		Pokemon poke_2 = context.getBean("myPoke_2", Pokemon.class);
		Squirtle squirtle2 = (Squirtle)poke_2;
		
		// Use the bean object
		System.out.println(squirtle.getElement().getTypeElement());
		System.out.println(squirtle2.yellName() + " element: " + squirtle2.getElement().getTypeElement());
		
		// Close IOC container
		context.close();
	}

}
