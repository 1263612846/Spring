package com.demo.dao;

import com.demo.bean.Person;

public interface Dao {

	public void execute(Person p);

	public String elder();

	public String kid();

	public Person result(String s);
	
}
