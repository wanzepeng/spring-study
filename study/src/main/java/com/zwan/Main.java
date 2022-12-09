package com.zwan;

import com.zwan.bean.Person;
import com.zwan.extend.MyClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-${username}.xml");
		ApplicationContext applicationContext = new MyClassPathXmlApplicationContext("spring-${username}.xml");
		Person person = applicationContext.getBean(Person.class);
		person.sayHello();
	}
}