package veterinary.com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import veterinary.com.model.Person;

@Service
public class serviceMockImp implements ServiceMock {


	@Override
	public List<Person> getAllPersons() {
		return this.getAllPersons();
	}
	
}
