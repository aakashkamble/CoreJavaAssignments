package IntermediateOOPAssignments;

import java.util.ArrayList;
import java.util.Scanner;

abstract class DessertItem{
	abstract double getCost();
}

class Candy extends DessertItem{

	@Override
	double getCost() {
		// TODO Auto-generated method stub
		return 2.0;
	}
	
}
class Cookie extends DessertItem{

	@Override
	double getCost() {
		// TODO Auto-generated method stub
		return 1.5;
	}
	
}
class IceCream extends DessertItem{

	@Override
	double getCost() {
		// TODO Auto-generated method stub
		return 50.0;
	}
	
}
class DessertShop{
	private ArrayList<DessertItem> storage=new ArrayList<>();
	
	public void addItem(DessertItem item) {
		storage.add(item);
		System.out.println("Item Added in Storage");
	}
	public void display() {
		System.out.println("Item in Storage");
		for( DessertItem item: storage) {
			System.out.println("Cost: "+item.getCost()+"Rupees");
		}
	}
}
public class DessertShopApp {
	
	public static void addDessertItems(DessertShop dessertShop) {
		System.out.println("Adding dessert items to Storage");
		
		dessertShop.addItem(new Candy());
		dessertShop.addItem(new Cookie());
		dessertShop.addItem(new IceCream());
		
		dessertShop.display();
	}

	public static void placeOrder( DessertShop dessertShop) {
		System.out.println("Placing an order");
		
		dessertShop.display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your role:");
		String role=sc.nextLine();
		
		DessertShop dessertShop=new DessertShop();
		
		if("owner".equalsIgnoreCase(role)) {
			addDessertItems(dessertShop);
		}
		else if("customer".equalsIgnoreCase(role)) {
			placeOrder(dessertShop);
		}
		else
		{
			System.out.println("InValid Role");
		}

		sc.close();
	}

}
