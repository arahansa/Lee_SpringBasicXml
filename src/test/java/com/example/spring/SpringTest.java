package com.example.spring;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringTest {

	@Test
	public void springTest() throws Exception {
		
		final ConfigurableApplicationContext bf = new GenericXmlApplicationContext("");
		final Object bean = bf.getBean("");
		bf.close();
	}
}
