package com.hafid.spring.projects.configurations.XML;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hafid.spring.projects.classes.element.TypeElement;
import com.hafid.spring.projects.classes.pokemon.Charmander;
import com.hafid.spring.projects.classes.pokemon.Pokemon;
import com.hafid.spring.projects.classes.pokemon.Squirtle;

public class PokemonXMLApp {

	public static void main(String[] args) {
		
		// Create IOC container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("PokemonConfig.xml"); 
		
		// Get bean object
		Pokemon poke_1 = context.getBean("myPoke_1", Pokemon.class);			
		Squirtle squirtle1 = (Squirtle)poke_1;
		
		Pokemon poke_2 = context.getBean("myPoke_2", Pokemon.class);
		Charmander charmander1 = (Charmander)poke_2;
		
		Pokemon poke_3 = context.getBean("myPoke_2", Pokemon.class);
		Charmander charmander2 = (Charmander)poke_3;
		
		TypeElement water = context.getBean("myElement1", TypeElement.class);
		
		// Use the bean object
		System.out.println("Pokemon 1: " + squirtle1.yellName() + "\nElement: " + squirtle1.getElement().getTypeElement());
		System.out.println("Pokemon 2: " + charmander1.yellName() + "\nElement: " + charmander1.getElement().getTypeElement());
		System.out.println("Pokemon 3: " + charmander2.yellName() + "\nElement: " + charmander2.getElement().getTypeElement());
		charmander2.setElement(water);
		System.out.println("Pokemon 3: " + charmander2.yellName() + "\nElement: " + charmander2.getElement().getTypeElement());
		System.out.println("Pokemon 2: " + charmander1.yellName() + "\nElement: " + charmander1.getElement().getTypeElement());
		
		// Close IOC container
		context.close();
	}

}
