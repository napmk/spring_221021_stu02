package com.napmkmk.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String configLocation1 = "classpath:applicationCTX1.xml";
		String configLocation2 = "classpath:applicationCTX2.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation1, configLocation2);
		
		Student student1 = ctx.getBean("student1", Student.class);
		System.out.println(student1.getName());
		System.out.println(student1.getAge());
		System.out.println(student1.getHobbys());
		System.out.println(student1.getHeight());
	//	System.out.println(student1.getWeight());
		
		StudentInfo studentInfo =ctx.getBean("studentInfo1", StudentInfo.class);
		Student studentHong = studentInfo.getStudent();
		
		System.out.println("--------------------------");
		System.out.println(studentHong.getName());
		
		if(student1.equals(studentHong)) {
			System.out.println("student1 과 studentHong 은 같은 객체 입니다. ");
		}else {
			System.out.println("student1 과 studentHong 은 다른 객체 입니다. ");
		}
		
		Student student2 = ctx.getBean("student2", Student.class);
		System.out.println(student2.getName());
		System.out.println(student2.getAge());
		System.out.println(student2.getHobbys());
		System.out.println(student2.getHeight());
		
		
		
		
		Family family = ctx.getBean("family", Family.class);
		System.out.println(family.getFather());
		System.out.println(family.getMother());
		System.out.println(family.getSister());
		System.out.println(family.getBrother());
		
		
		ctx.close();
		
	}

}
