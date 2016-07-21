package veterinary.com.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

 @Entity
public class Person {

	@Id
	@Column(name="id_person")
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	
	@Column(name="firstName_person")
	private String firstName;

	@Column(name="lastName_person")
	private String lastName;

	@Column(name="age_person")
	private int age;

	@Column(name="address_person")
	private String address;

	@Column(name="email_person")
	private String email;

	@Transient
	private List<Rutina> rutinas;



	public Person(int id,String firstName, String lastName, int age, String address,
			String email) {
		this.id=id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
		this.email = email;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	public List<Rutina> getRutinas() {
		return rutinas;
	}

	public void setRutinas(List<Rutina> rutinas) {
		this.rutinas = rutinas;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
