package program10;

public class Address {

	private String street;
	private String city;
	private String state;
	private String zipcode;
	
	public Address(String street, String city, String state, String zip) {
		this.street = street; 
		this.city = city;
		this.state = state;
		this.zipcode = zip;
	}
	
	public String getStreet() {
		return street;
	}
	
	public String getCity() {
		return city;
	}
	public Address(Address A) {
		this(A.getStreet(),A.getCity(), A.getState(), A.getZipcode() );
	}
	
	public String getState() {
		return state;
	}
	
	public String getZipcode() {
		return zipcode;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("\nAddress: ");
		str.append(String.format("%s\n%s, %s %s",street,city, state, zipcode));
		return str.toString();
	}
	


}
