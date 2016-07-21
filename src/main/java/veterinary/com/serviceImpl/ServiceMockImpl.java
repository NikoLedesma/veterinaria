package veterinary.com.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import veterinary.com.entity.Person;
import veterinary.com.service.ServiceMock;

@Service
public class ServiceMockImpl implements ServiceMock {


	@Override
	public List<Person> getAllPersons() {
		return this.getAllPersons();
	}
	
}
