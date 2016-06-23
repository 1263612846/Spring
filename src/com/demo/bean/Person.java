package com.demo.bean;

public class Person {

	private String name;
	private int age;
	private String sex;

	public String getName() {
		return name;
	}

	public Person setName(String name) {
		this.name = name;
		return this;
	}

	public int getAge() {
		return age;
	}

	public Person setAge(int age) {
		this.age = age;
		return this;
	}

	public String getSex() {
		return sex;
	}

	public Person setSex(String sex) {
		this.sex = sex;
		return this;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}

}
