package com.javaprogramto.bean.create.beancreation;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponetExample {

	Logger logger = LoggerFactory.getLogger(getClass());

	@PostConstruct
	public void printMessage() {

		logger.info("@Component object is registered with the context.");
	}

}
