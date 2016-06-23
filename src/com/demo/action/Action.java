package com.demo.action;

import com.demo.bean.Person;
import com.demo.service.Service;

public class Action {
	private Service service;

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public String action(Person p) {
		return service.getInfo(p);
	}

	public Person action1(String s) {
		return service.returnInfo(s);
	}

}
