package com.javaprogramto.bean.create.beancreation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class NumberGeneratorRunner implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private NumberGenerator generator;

	@Override
	public void run(String... args) throws Exception {
		logger.info("Random number : " + generator.getNumber());
		logger.info("Random number : " + generator.getNumber());
		logger.info("Random number : " + generator.getNumber());
		logger.info("Random number : " + generator.getNumber());
		logger.info("Random number : " + generator.getNumber());

	}

}
