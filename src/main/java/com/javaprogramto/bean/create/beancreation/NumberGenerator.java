package com.javaprogramto.bean.create.beancreation;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class NumberGenerator {

	public Integer getNumber() {

		Random random = new Random();
		Integer randomValue = random.nextInt();
		return randomValue;
	}

}
