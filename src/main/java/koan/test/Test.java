package koan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import koan.dao.IUsersDAO;

public class Test {
	private static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml");
		IUsersDAO userdao = (IUsersDAO) ac.getBean("userDAOImpl");
		System.out.println(userdao);

	}

}
