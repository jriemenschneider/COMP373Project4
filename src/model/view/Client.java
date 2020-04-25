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
        //////Builder Client in this main function(put below here)
        
        private volatile Cart cart;
        
        public client() {
        	Thread t1 = new Thread(new Runnable() {
        		@Override
        		public void run() {
        			cart = Cart.Builder.newInstance()
        					.setTotal(3.00)
        					.setPrice(3.00)
        					.setNameOfItem("Avocado");
        					.build();
        	}
        	});
        	Thread t2 = new Thread(new Runnable() {
        		@Override
        		public void run() {
        			cart = Cart.Builder.newInstance()
        					.setTotal(5.00)
        					.setPrice(5.00)
        					.setNameOfItem("Candy")
        					.build();
        		}
        	});
        			
        t1.start();  
        t2.start();
        
    } 
	public Cart getCart() {
		
		return cart; 
	}
	
}
	


