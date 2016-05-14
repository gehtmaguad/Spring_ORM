package dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import model.Person;

@Repository("PersonDao")
@Transactional(propagation = Propagation.REQUIRED)
public class PersonDao {
	@PersistenceContext
	private EntityManager entityManager;

	public void save(Person person) {
		entityManager.persist(person);
	}

	public Person findByPrimaryKey(int id) {
		Person person = entityManager.find(Person.class, id);

		return person;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
}
