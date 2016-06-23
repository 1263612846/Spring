package com.demo.service.imp;

import com.demo.bean.Person;
import com.demo.dao.Dao;
import com.demo.service.Service;

public class ServiceImp implements Service {
	private Dao dao;

	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}

	@Override
	public String getInfo(Person p) {
		String sex = p.getSex();
		int age = p.getAge();
		if (("male").equals(sex)) {
			p.setSex("ÄĞ");
		} else {
			p.setSex("Å®");
		}
		dao.execute(p);
		if (age >= 18) {
			return dao.elder();
		} else {
			return dao.kid();
		}

	}

	@Override
	public Person returnInfo(String s) {
		return dao.result(s);
	}

}
