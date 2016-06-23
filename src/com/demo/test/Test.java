package com.demo.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.action.Action;
import com.demo.bean.Person;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_beans.xml");
		Action d = (Action) context.getBean("action");

		Person p = new Person();
		p.setName("张三").setAge(22).setSex("male");

		System.out.println(d.action(p));

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入姓名：");
		System.out.println(d.action1(sc.nextLine()));
	}

}
