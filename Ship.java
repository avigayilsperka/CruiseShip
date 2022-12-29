package program10;


public class Ship {
	
	private String name;
	private int year;
	
	public Ship() {
	}
	
	public Ship(String name, int year) {
		this.name = name;
		this.year = year;
	}
	
	public void setName(String s) {
		name = s;
	}
	
	public String getName() {
		return name;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("\nName: "+name);
		str.append("\nYear: "+year);
		return str.toString();
	}
}
