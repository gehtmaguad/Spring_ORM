package main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.PersonDAO;
import model.Person;

public class SpringHibernateMain {
 
    public static void main(String[] args) {
 
    	// Get context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
         
        // create dao object
        PersonDAO personDAO = context.getBean(PersonDAO.class);
         
        // create object to persist
        Person person = new Person();
        person.setFirstname("foo"); 
        person.setSurname("bar");
        person.setAge(22);
        //person.setPhone_number(12345);
         
        // use dao to persist object
        personDAO.save(person);
        System.out.println("Persisted person");
         
        // use dao to get records and print them
        List<Person> list = personDAO.list();
        for(Person p : list){
            System.out.println("Person List::"+p);
        }

        // close context
        context.close();    
    }
}