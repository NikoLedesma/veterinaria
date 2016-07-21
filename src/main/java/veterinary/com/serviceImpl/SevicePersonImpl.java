package veterinary.com.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import veterinary.com.entity.Person;
import veterinary.com.service.ServicePerson;

@Service
public class SevicePersonImpl implements ServicePerson {
	public Person createPerson() {
		return new Person(1, "Pepe", "Ledesma", 18, "Av.Gral Las Heras",
				"pepe@gmail.com");
	}

	public List<Person> addPerson(Person person, List<Person> persons) {
		persons.add(person);
		return persons;
	}
	
	@Override
	public Person retrievePersonById(int id, List<Person> persons) {
		int i=0;
		Person person;
		if (persons != null) {
			while(i<persons.size()){
				person=persons.get(i);
				if( person.getId()==id){
					return person;
				}	
				i++;
			}
		}
		return null;
	}

	public void deletePerson(int id, List<Person> persons) {
		int i=0;
		Person person;
		if (persons != null) {
			while(i<persons.size()){
				person=persons.get(i);
				if( person.getId()==id){
					persons.remove(person);
				}
				i++;
			}
		}
	}

}
