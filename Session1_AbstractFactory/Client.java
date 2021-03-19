package Session1_AbstractFactory;

import java.util.Scanner;

public class Client {
	
	public static Factory getFactory(String factoryType)
	{
		if(factoryType.equalsIgnoreCase("Mercedes"))
		{
			return new MercedesFactory();
		}
		else
		{
			return new AudiFactory();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the company of car to manufacture (Mercedes/Audi): ");
		String factoryType = sc.next();
		Factory f = getFactory(factoryType);
		f.makeTire().getTire();
		f.makeHeadlight().getHeadlight();
	}

}
