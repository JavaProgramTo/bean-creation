package com.javaprogramto.bean.create.beancreation;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanScopes {

	@Bean(name = "p1")
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Produce getProduceBean() {

		return new ProduceImpl();
	}
}

class ProduceImpl implements Produce {

	@Override
	public String generate() {
		// TODO Auto-generated method stub
		return "Produce object " + Math.random();
	}
}