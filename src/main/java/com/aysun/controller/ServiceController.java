package com.aysun.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ServiceController {

	@RequestMapping("/welcome")
	public ModelAndView webService() {
		
		
		
		
		Student_Info student = new Student_Info();
		student.setRollNo(1);
		student.setName("Test Name");
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		session.save(student);
		
		session.getTransaction();
		session.close();
		
		sessionFactory.close();
		
		
		
		
		
		
		
		String test = "random message";

		return new ModelAndView("welcome", "message", test);
	}
}
