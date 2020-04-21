package com.javaprogramto.bean.create.beancreation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanScopesBody implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	@Qualifier("p1")
	private Produce p1;

	@Autowired
	@Qualifier("p1")
	private Produce p2;

	@Override
	public void run(String... args) throws Exception {
		logger.info(" produced value 1: hash " + p1.hashCode());
		logger.info(" produced value 2: hash " + p2.hashCode());

	}

}
