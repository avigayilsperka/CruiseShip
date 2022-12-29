package program10;
import java.util.*;

public class ShipDemo {

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		cruiseShip(input);
		cargoShip(input);
	}
	
	public static void cruiseShip(Scanner input) {
		
		//create cruise ship objects array
		System.out.println("How many cruise ships would you like to enter: ");
		int size = input.nextInt();
		input.nextLine();
		ArrayList<CruiseShip> cruises = new ArrayList<>(size);
		
		//collect info
		for (int x = 0; x<size; x++) {
			System.out.println("Ship #"+(x+1)+" Information:");
			System.out.println("\nName: ");
			String name = input.nextLine();
			System.out.println("\nYear built:");
			int year = input.nextInt();
			input.nextLine();
			System.out.println("\nMax Passengers: ");
			int max = input.nextInt();
			input.nextLine();
		
			//create object
			ArrayList<Passenger> passengers = new ArrayList<>();
			cruises.add(new CruiseShip(max, passengers, name, year));
			System.out.println("\nType 1 to enter a passenger or 0 to skip:");
			int add = input.nextInt();
			input.nextLine();
			while (add != 1 && add !=0) {
				System.out.println("\nError. Please enter a 1 or 0:");
				add = input.nextInt();
				input.nextLine();
			}
			
			//add passenger
			while(add==1) {
				System.out.println("\nPassenger Information:");
				System.out.println("\nFirst Name: ");
				String fname = input.nextLine();
				System.out.println("\nLast Name:");
				String lname = input.nextLine();
				System.out.println("\nGender (m or f):");
				String g = input.nextLine().toUpperCase();
				System.out.println("\nStreet: ");
				String street = input.nextLine();
				System.out.println("\nCity:");
				String city = input.nextLine();
				System.out.println("\nState:");
				String state = input.nextLine();
				System.out.println("\nZip:");
				String zip = input.nextLine();
				System.out.println("\nBirthdate (YEAR - MONTH - DAY):");
				String bday = input.nextLine();
				System.out.println("\nPassport ID:");
				String id = input.nextLine();
				System.out.println("\n# Luggage Pieces:");
				int luggage = input.nextInt();
				input.nextLine();
				Passenger p = new Passenger(fname,lname,gender(g),new Address(street,city,state,zip),bday,id,luggage);
				//add or catch exception 
				try {
					cruises.get(x).addPassenger(p);
				}catch(PassengerExistsException e) {
					System.out.println("Error: Passenger already exists or you have entered beyond the max.");
				}
				System.out.println("\nType 1 to enter another passenger or 0 to skip:");
				add = input.nextInt();
				while (add != 1 && add !=0) {
					System.out.println("\nError. Please enter a 1 or 0:");
					add = input.nextInt();
					input.nextLine();
				}
				
				input.nextLine();
			}
			
		}
		//print cruise info
		System.out.println("\n"+ cruises);
		
	}
		
		public static void cargoShip(Scanner input) {
			//cargo ship array
			System.out.println("\nNumber of cargo ships:");
			int num = input.nextInt();
			ArrayList<CargoShip> cargoShip = new ArrayList<>(num);
			input.nextLine();
			//collect info
			for (int x = 0; x<num; x++) {
				System.out.println("Enter the information for cargo ship #"+(x+1)+":");
				System.out.println("\nName: ");
				String name = input.nextLine();
				System.out.println("\nYear built:");
				int year = input.nextInt();
				input.nextLine();
				System.out.println("\nCargo capacity:");
				int capacity = input.nextInt();
				input.nextLine();
				cargoShip.add(new CargoShip (capacity,name,year));
			}
			System.out.println("\n"+cargoShip);
		}
		
		//pass enum
		public static Gender gender(String g) {
			if (g.equals("M"))
				return Gender.MALE;
			else 
				return Gender.FEMALE;
		}
		
		
		
	
		
	
	
	
	}

	


