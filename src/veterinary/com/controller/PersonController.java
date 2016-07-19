package veterinary.com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import veterinary.com.model.Person;
import veterinary.com.service.ServiceMock;
import veterinary.com.service.ServicePerson;




@Controller
public class PersonController {


	
	private List<Person> persons=new ArrayList<Person>();
	

	
	
	public PersonController(){
		super();
		persons.add(new Person(1,"pepe","Ledesma",54,"Av.Gral Las Heras","pepe@gmail.com"));
		persons.add(new Person(2,"Fermin","Ledesma",54,"Av.Gral Las Heras","fermintt@gmail.com"));
		persons.add(new Person(3,"Claudio","Ledesma",32,"Av.Gral Las Heras","claudita@gmail.com"));
		persons.add(new Person(4,"Jesus","Ledesma",11,"Av.Gral Las Heras","jes@gmail.com"));
		persons.add(new Person(5,"Tamara","Ledesma",52,"Av.Gral Las Heras","tamaChot@gmail.com"));
		persons.add(new Person(6,"Ulises","Ledesma",64,"Av.Gral Las Heras","uly@gmail.com"));
	}

	@Autowired
	private ServicePerson servicePerson;
	
	@Autowired 
	private ServiceMock serviceMock;
	
	@RequestMapping(value="/person")
	public ModelAndView person(){
		ModelAndView mv=new ModelAndView("person/person");	
//		servicePerson.addPerson(new Person(2,"Fermin","Ledesma",54,"Av.Gral Las Heras","fermintt@gmail.com"), persons);
//		servicePerson.addPerson(new Person(3,"Claudio","Ledesma",32,"Av.Gral Las Heras","claudita@gmail.com"), persons);
//		servicePerson.addPerson(new Person(4,"Jesus","Ledesma",11,"Av.Gral Las Heras","jes@gmail.com"), persons);
//		servicePerson.addPerson(new Person(5,"Tamara","Ledesma",52,"Av.Gral Las Heras","tamaChot@gmail.com"), persons);
//		servicePerson.addPerson(new Person(6,"Ulises","Ledesma",64,"Av.Gral Las Heras","uly@gmail.com"), persons);
		//List<Person>persons=serviceMock.getAllPersons();
		mv.addObject("persons",persons);
		return mv;
	}
	
	@RequestMapping(value="/editPerson/{id}",method=RequestMethod.GET)
	public ModelAndView editPerson(@PathVariable("id") int id){
		ModelAndView mv=new ModelAndView("person/editPerson");
		//List<Person>persons=serviceMock.getAllPersons();
		if(persons!=null && !persons.isEmpty()){
		Person person=servicePerson.retrievePersonById(id, persons);
		mv.addObject("person",person);
		}
		return mv;
	}
	
	    @RequestMapping (value="/deletePerson/{id}",method=RequestMethod.GET)
	    public String deletePerson(@PathVariable("id") int id){
		//List<Person>persons=serviceMock.getAllPersons();
	    servicePerson.deletePerson(id, persons);
	    return "redirect:/person";
	    }
	    
}
