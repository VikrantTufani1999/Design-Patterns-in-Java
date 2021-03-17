package Session1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		PhoneRepair phoneRepair = new PhoneRepair();
		AccessoryRepair accessoryRepair = new AccessoryRepair();
		Order order = new Order();
		
		String productDetail = "";
		
		System.out.println("Welcome to our site, Would you like to order or repair?");
		String processOption = sc.nextLine().toLowerCase().trim();
		
		switch(processOption)
		{
		case "order":
			System.out.println("Please provide the phone model name");
			productDetail = sc.nextLine().trim();
			order.OrderProcess(productDetail);
			
		case "repair":
			System.out.println("Is it the phone or the accessory that you want to be repaired");
			String productType = sc.nextLine().toLowerCase();
			if(productType.equals("phone"))
			{
				System.out.println("Please provide the phone model name");
				productDetail = sc.nextLine().trim();
				phoneRepair.PhoneRepairProcess(productDetail);
			}
			else
			{
				System.out.println("Please provide the accessory detail, like headphone, tempered glass");
				productDetail = sc.nextLine().trim();
				accessoryRepair.AccessoryRepairProcess(productDetail);
			}
			break;
			default:
				break;
		}
	}

}
