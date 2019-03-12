package com.hafid.spring.projects.classes.element;

import org.springframework.stereotype.Component;

@Component()
public class Grass implements TypeElement {

	@Override
	public String getTypeElement() {
		return "Grass";
	}

}
