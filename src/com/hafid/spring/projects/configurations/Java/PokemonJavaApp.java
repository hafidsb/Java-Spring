package com.hafid.spring.projects.configurations.Java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hafid.spring.projects.classes.pokemon.Pikachu;
import com.hafid.spring.projects.classes.pokemon.Pokemon;

public class PokemonJavaApp {

	public static void main(String[] args) {
		
		// Create IOC container
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(PokemonJavaConfig.class);
		
		// Get bean object
		Pokemon poke_1 = context.getBean("Pikachu", Pokemon.class);
		Pikachu pikachu = (Pikachu)poke_1;
		
		// Use bean object
		System.out.println("Pokemon 1: " + pikachu.yellName() + "\nElement: " + pikachu.getElement().getTypeElement());
		
		// Close IOC container
		context.close();

	}

}
