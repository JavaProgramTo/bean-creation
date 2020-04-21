package com.javaprogramto.bean.create.beancreation;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class MethodInjection {

	@Bean("p3")
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Produce methodInjection() {

		return new Produce() {

			@Override
			public String generate() {

				return "" + Math.random();
			}
		};
	}

}
