package cn.lemko.gps.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.lemko.gps.service.GpsService;

public class Tester {

	@Test
	public void testSpring() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"application.xml");
		System.out.println(ctx.getBean("transactionManager"));
	}

	@Test
	public void testDao() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"application.xml");
		GpsService sv = (GpsService) ctx.getBean("service");
		sv.save();
	}
}
