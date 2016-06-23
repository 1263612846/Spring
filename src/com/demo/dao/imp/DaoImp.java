package com.demo.dao.imp;

import com.demo.bean.Person;
import com.demo.dao.Dao;

public class DaoImp implements Dao {
	private static Person p;

	@Override
	public void execute(Person p) {
		DaoImp.p = p;
	}

	public String elder() {
		return "已成年！";
	}

	public String kid() {
		return "未成年！";
	}

	@Override
	public Person result(String s) {
		if (s.equals(p.getName())) {
			return p;
		} else if (s.equals("高志聪")) {
			System.out.println("大哥必须能找到啊！");
			return null;
		} else {
			System.out.println(s + "找不到对象！");
			return null;
		}

	}

}
