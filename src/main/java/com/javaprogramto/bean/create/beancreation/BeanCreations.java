package com.javaprogramto.bean.create.beancreation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanCreations implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	@Qualifier("p2")
	Produce produce1;

	@Autowired
	@Qualifier("p2")
	Produce produce2;

	@Bean("p2")
	public Produce getProduce() {

		return () -> "Produced Value";
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info(" produced value 1: hash " + produce1.hashCode());
		logger.info(" produced value 1: " + produce1.generate());
		logger.info("---------------------------------------");
		logger.info(" produced value 2: hash " + produce2.hashCode());
		logger.info(" produced value 2: " + produce2.generate());

	}

}
