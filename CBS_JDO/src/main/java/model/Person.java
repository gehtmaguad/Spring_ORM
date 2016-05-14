package model;

import java.io.Serializable;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(table = "Person")
public class Person {
 
	@Persistent
	@PrimaryKey
    private int id;
    
	@Persistent
    private String firstname;  
	
	@Persistent
	private String surname;
	
	@Persistent
    private int age;
	
	@Persistent
    private int phone_number;
	
    
    public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}

      @Override
    public String toString(){
        return "id is " + id + ", name is " + firstname + 
        		" " + surname + ", age is " + age 
        		+ ", phone number is " + phone_number;
    }
}
