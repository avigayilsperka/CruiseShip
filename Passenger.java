package program10;

public class Passenger extends Person{

	private String passportID;
	private int luggagePieces;
	
	public Passenger(String f, String l, Gender g, Address addr, String birthdate, String passportID, int luggage) {
		super(f,l,g,addr,birthdate);
		this.passportID = passportID;
		luggagePieces= luggage;
	}
	
	public Passenger(Passenger p) {
		super(p.getFirstName(),p.getLastName(),p.getGender(),p.getAddress(),p.getBirthdate());
		this.passportID = p.getPassportID();
	
	}
	
	public String getPassportID() {
		return passportID;
	}
	
	@Override 
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append(super.toString());
		str.append("\nPassport ID: "+passportID);
		str.append("\nLuggage Pieces: "+luggagePieces);
		return str.toString();
		
	}
	@Override
	public boolean equals(Object o) {
		if (o==null)
			return false;
		if (this == o)
			return true;
		if (this.getClass() != o.getClass())
			return false;
		Passenger other = (Passenger) o;
		if(this.passportID.equals(other.getPassportID()))
			return true;
		else 
			return false; 
		
	}
	
}



