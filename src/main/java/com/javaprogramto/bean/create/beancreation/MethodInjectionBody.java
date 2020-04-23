package com.javaprogramto.bean.create.beancreation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MethodInjectionBody implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private MethodInjection methodInjection1;

	@Autowired
	private MethodInjection methodInjection2;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		logger.info("Demo for method injection");
		logger.info("methodInjection1 hashcode :  " + methodInjection1.hashCode());
		logger.info("methodInjection2 hashcode :  " + methodInjection2.hashCode());

		logger.info("both objects hascodes are same. So, MethodInjection is singleton");

		logger.info("methodInjection1 hashcode :  " + methodInjection1.hashCode());
		logger.info("methodInjection1 produce hashcode :  " + methodInjection1.methodInjection().hashCode());
		logger.info("methodInjection1 produce hashcode :  " + methodInjection1.methodInjection().hashCode());
		logger.info("methodInjection1 produce hashcode :  " + methodInjection1.methodInjection().hashCode());

		logger.info("methodInjection2 hashcode :  " + methodInjection2.hashCode());
		logger.info("methodInjection2 produce hashcode :  " + methodInjection2.methodInjection().hashCode());
		logger.info("methodInjection2 produce hashcode :  " + methodInjection2.methodInjection().hashCode());
		logger.info("methodInjection2 produce hashcode :  " + methodInjection2.methodInjection().hashCode());

	}

}


