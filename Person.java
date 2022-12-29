package program10;

import java.time.LocalDate;

public class Person {

	private String fname;
	private String lname;
	private Gender gender;
	private LocalDate birthdate;
	private Address address;
	
	
	public Person(String f, String l, Gender g, Address add, String birthdate) {
		this(f,l,g,new Address(add), LocalDate.parse(birthdate));
		
	}
	public Person(String f, String l, Gender g, String s, String c, String state, String zip, String birthdate){
		this(f,l,g, new Address(s,c,state,zip), LocalDate.parse(birthdate));
		
	}
	public Person(String f, String l, Gender g, Address add, LocalDate birthdate) {
		fname = f;
		lname = l;
		gender =g;
		address = add;
		this.birthdate = birthdate;
		
	}
	public Person(Person p) {
		this(p.getFirstName(), p.getLastName(),p.getGender(), p.getAddress(),p.getBirthdate());
	}
	
	public String getFirstName() {
		return fname;
	}

	public String getLastName() {
		return lname;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public LocalDate getBirthdate() {
		return birthdate;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address add) {
		address= add;
	}
	public void setLastName(String name) {
		lname = name;
	}
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("\nName: "+ fname +" "+lname);
		return str.toString();
		
	}
	@Override 
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (this == o)
			return true;
		if (this.getClass()!=o.getClass())
			return false;
		Person p = (Person) o;
		if(this.getFirstName().equals(p.getFirstName())&& this.getLastName().equals(p.getLastName())) {
			if(this.getBirthdate().equals(p.getBirthdate()))
				return true;
			}
		return false;
	}
	
}
