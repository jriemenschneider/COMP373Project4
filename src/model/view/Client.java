package model.view;

import model.visitor.*;
public class Client {
	//TEST CLIENT
	public static void main(String[] args)  
    { 
        Visitable[] items = new Visitable[] {new OrderCart("Oranges", (float) (7.50)), new OrderCart("Clorox Wipes", (float) 800.00), new OrderCart("Toilet Paper One Square", (float) 25.25)};
        double taxTotal = calcTax(items);
        System.out.println("Total tax added: " + taxTotal);
    } 
	
	private static float calcTax(Visitable[] cartItems) {
		Visitor visitor = new TaxVisitor();
		float taxTotal = 0;
		for(Visitable item: cartItems) {
			taxTotal = taxTotal + item.accept(visitor);
		}
		return taxTotal;
	}
	
}

