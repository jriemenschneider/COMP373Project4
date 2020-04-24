package model.view;

import model.visitor.*;
public class Client {
	//CLIENT
	public static void main(String[] args)  
    { 
        IterateThroughCart iTC = new IterateThroughCart();
		Visitable[] items = new Visitable[] {new OrderCart("Apples", 10.00), new OrderCart("Clorox Wipes", 20.00), new OrderCart("Toilet Paper One Square",  100.00)};
        double taxTotal = iTC.calcTax(items);//gets total of all items
        System.out.println("Total with tax added: " + taxTotal);
    } 
	//OTHER PATTERN
	
}
	


