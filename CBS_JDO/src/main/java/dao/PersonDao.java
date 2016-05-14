package dao;

import javax.jdo.PersistenceManagerFactory;

import model.Person;


public class PersonDao {

	private PersistenceManagerFactory persistenceManagerFactory = null;

	public void persist(Person p) {
		persistenceManagerFactory.getPersistenceManager().makePersistent(p);

		System.out.println("Persisted: " + p.toString());
	}

	public void setPersistenceManagerFactory(PersistenceManagerFactory persistenceManagerFactory) {
		this.persistenceManagerFactory = persistenceManagerFactory;
	}

	public PersistenceManagerFactory getPersistenceManagerFactory() {

		return persistenceManagerFactory;
	}
}
