package com.hafid.spring.projects.classes.pokemon;

import com.hafid.spring.projects.classes.element.TypeElement;

public class Charmander implements Pokemon {
	private TypeElement element;
	private int atk;
	private int def;
	private int hp;
	
	public Charmander() {
		super();
	}

	public Charmander(TypeElement element, int atk, int def, int hp) {
		super();
		this.element = element;
		this.atk = atk;
		this.def = def;
		this.hp = hp;
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

	public TypeElement getElement() {
		return element;
	}

	public void setElement(TypeElement element) {
		this.element = element;
	}

	@Override
	public String yellName() {
		return "Charmander";
	}

}
