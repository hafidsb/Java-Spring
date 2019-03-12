package com.hafid.spring.projects.configurations.Java;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.hafid.spring.projects.classes.pokemon.Pokemon;
import com.hafid.spring.projects.classes.pokemon.Pikachu;
import com.hafid.spring.projects.classes.element.TypeElement;
import com.hafid.spring.projects.classes.element.Electric;

@Configuration
@PropertySource("classpath:pokemon.properties")
public class PokemonJavaConfig {

	@Bean
	public TypeElement Electric() {
		return new Electric();
	}
	
	@Bean
	public Pokemon Pikachu(TypeElement element, 
						   @Value("${poke2.atk}")int atk, 
						   @Value("${poke2.def}")int def,
						   @Value("${poke2.hp}")int hp){
		
		Pikachu pikachu1 = new Pikachu(Electric(), atk, def,  hp);
		
		return pikachu1;
	}

}
