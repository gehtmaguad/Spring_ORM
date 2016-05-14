package main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.PersonDao;
import model.Person;

public class SpringJpaMain {
	public static void main(String[] args) {
		try {
			
			// Get context
			ApplicationContext context = new ClassPathXmlApplicationContext("resources\\spring.xml");

			// create dao object
			PersonDao personDao = (PersonDao) context.getBean("PersonDao");
			
			// create object to persist
	        Person person = new Person();
	        person.setFirstname("foo"); 
	        person.setSurname("bar");
	        person.setAge(22);
	        person.setPhone_number(12345);			

	        // use dao to persist object
			personDao.save(person);
			System.out.println("Person Saved: " + person.toString());

			// use dao to get one records by id
			Person pers = personDao.findByPrimaryKey(0);
			System.out.println(pers.toString());

			// close context
			((ConfigurableApplicationContext) context).close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
