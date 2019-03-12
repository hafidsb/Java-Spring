package com.hafid.spring.projects.classes.pokemon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.hafid.spring.projects.classes.element.TypeElement;

@Component
public class Bulbasaur implements Pokemon {
	
	private TypeElement element;	
	private int atk;
	private int def;
	private int hp;
	
	public Bulbasaur() {
		super();
	}
	
	@Autowired
	public Bulbasaur(@Qualifier("grass")TypeElement element, 
					 @Value("${poke1.atk}")int atk, 
					 @Value("${poke1.def}")int def, 
					 @Value("${poke1.hp}")int hp) {
		super();
		this.element = element;
		this.atk = atk;
		this.def = def;
		this.hp = hp;
	}

	public TypeElement getElement() {
		return element;
	}

	public void setElement(TypeElement element) {
		this.element = element;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	@Override
	public String yellName() {
		return "Bulbasaur";
	}

}
