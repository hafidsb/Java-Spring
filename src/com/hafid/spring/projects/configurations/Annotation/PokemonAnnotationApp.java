package com.hafid.spring.projects.configurations.Annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hafid.spring.projects.classes.pokemon.Bulbasaur;
import com.hafid.spring.projects.classes.pokemon.Pokemon;

public class PokemonAnnotationApp {

	public static void main(String[] args) {
		//Create IOC container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("PokemonConfig2.xml");
		
		//Get bean objects
		Pokemon poke_1 = context.getBean("bulbasaur", Pokemon.class);
		Bulbasaur bulbasaur = (Bulbasaur)poke_1;
		
		//Use the bean
		System.out.println(poke_1.getClass());
		System.out.println(bulbasaur.getElement().getTypeElement());
		System.out.println(bulbasaur.getAtk());
		
		//Close context/IOC container
		context.close();
		
	}

}
