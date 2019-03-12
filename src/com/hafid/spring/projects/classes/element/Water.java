package com.hafid.spring.projects.classes.element;

import org.springframework.stereotype.Component;

@Component
public class Water implements TypeElement {

	@Override
	public String getTypeElement() {
		return "Water";
	}

}
