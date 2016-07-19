package veterinary.com.service;

import java.util.List;

import veterinary.com.model.Person;

public interface ServicePerson {

	public Person createPerson();
	public List<Person> addPerson(Person person,List <Person>persons);
	public Person retrievePersonById(int id,List <Person>persons);
	public void deletePerson(int id, List<Person>persons);
}
