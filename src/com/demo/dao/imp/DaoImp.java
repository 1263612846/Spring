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
		return "�ѳ��꣡";
	}

	public String kid() {
		return "δ���꣡";
	}

	@Override
	public Person result(String s) {
		if (s.equals(p.getName())) {
			return p;
		} else if (s.equals("��־��")) {
			System.out.println("���������ҵ�����");
			return null;
		} else {
			System.out.println(s + "�Ҳ�������");
			return null;
		}

	}

}
