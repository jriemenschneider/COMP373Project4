package model.view;

import model.visitor.*;
public class Client {
	//TEST CLIENT
	public static void main(String[] args)  
    { 
        IterateThroughCart iTC = new IterateThroughCart();
		Visitable[] items = new Visitable[] {new OrderCart("Oranges", 7.50), new OrderCart("Clorox Wipes", 80.00), new OrderCart("Toilet Paper One Square",  25.00)};
        double taxTotal = iTC.calcTax(items);//gets total of all items
        System.out.println("Total with tax added: " + taxTotal);
    } 
	//TEST OTHER PATTERN
	
}
	


