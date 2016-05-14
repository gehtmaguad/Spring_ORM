package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.PersonDao;
import model.Person;

public class SpringJdoMain {

	public static void main(String[] args) {
		
    	// Get context
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		// create dao object
		PersonDao personDao = context.getBean("personDao", PersonDao.class);
		
		// create object to persist
        Person person = new Person();
        person.setFirstname("foo"); 
        person.setSurname("bar");
        person.setAge(22);
        //person.setPhone_number(12345);

        // use dao to persist object
		personDao.persist(person);
		System.out.println("Persisted person");
		
	}

}