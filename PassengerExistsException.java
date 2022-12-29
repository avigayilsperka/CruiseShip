package program10;

public class PassengerExistsException extends Exception{

	public PassengerExistsException(String str) {
		super(str);
	}
	
	public PassengerExistsException() {
		super("Error. Passenger exists exception.");
	}

}
