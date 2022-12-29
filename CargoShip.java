package program10;

public class CargoShip extends Ship {

	private int cargoCapacity;
	
	public CargoShip() {
	}
	
	public CargoShip(int capacity, String name, int year ) {
		super(name,year);
		cargoCapacity = capacity;
	}
	
	public void setCargoCapacity(int capacity) {
		cargoCapacity = capacity;
	}
	
	public int getCargoCapacity() {
		return cargoCapacity;
	}
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("\nName: "+super.getName());
		str.append("\nCargo Capacity: "+cargoCapacity);
		return str.toString();
	}

}
