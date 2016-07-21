package veterinary.com.serviceImpl;

import org.springframework.stereotype.Service;

import veterinary.com.entity.Person;
import veterinary.com.entity.Rutina;
import veterinary.com.service.ServiceRutina;



@Service
public class ServiceRutinaImpl implements ServiceRutina{

	public Rutina asignarAPersona(Person person) {
		Rutina rutina=new Rutina();
		person.getRutinas().add(rutina);
		return rutina;
	}
	
	
}
