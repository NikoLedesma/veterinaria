package veterinary.com.model;

import java.util.List;

public class Person {

	
	private int id;
	
	private String firstName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String lastName;

	private int age;

	private String address;

	private String email;

	private List<Rutina> rutinas;

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

	public Person(int id,String firstName, String lastName, int age, String address,
			String email) {
		this.id=id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
		this.email = email;
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

}
