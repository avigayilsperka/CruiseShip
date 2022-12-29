package program10;

import java.util.ArrayList;

public class CruiseShip extends Ship {
	private int maxPassenger;
	private ArrayList <Passenger> passengers;
	
	public CruiseShip (int max, ArrayList<Passenger>array, String name, int year) {
		super(name,year);
		maxPassenger = max;
		passengers = array;
	}
	
	public CruiseShip() {
	}
	
	public void setMaxPassenger(int max) {
		maxPassenger = max;
	}
	
	public int getMaxPassenger() {
		return maxPassenger;
	}
	
	public ArrayList <Passenger> getPassengers(){
		return new ArrayList<Passenger>(passengers);
	}
	
	public void addPassenger(Passenger p) throws PassengerExistsException {
			if (!passengers.contains(p) && passengers.size()<maxPassenger) {
				passengers.add(p);
				
			}
			else 
				throw new PassengerExistsException();
	}
	
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder ();
		str.append(super.toString());
		str.append("\nMax number of Passengers: "+maxPassenger);
		str.append(passengers.toString());
		return str.toString();
		
	}
}
