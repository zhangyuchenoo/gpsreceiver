package cn.lemko.gps.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	@Test
	public void testSpring() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"application.xml");
		System.out.println(ctx.getBean("transactionManager"));
	}
}
