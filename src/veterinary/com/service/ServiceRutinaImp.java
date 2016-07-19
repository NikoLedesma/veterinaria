package veterinary.com.service;

import org.springframework.stereotype.Service;

import veterinary.com.model.Person;
import veterinary.com.model.Rutina;



@Service
public class ServiceRutinaImp implements ServiceRutina{

	public Rutina asignarAPersona(Person person) {
		Rutina rutina=new Rutina();
		person.getRutinas().add(rutina);
		return rutina;
	}
	
	
}
