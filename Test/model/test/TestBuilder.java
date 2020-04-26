package model.test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.view.Client;
import model.visitor.Cart;


public class TestBuilder {

	Cart cr = new Cart(null);
	Client[] items;
	

	
	@Test
	public void patternTest() {
		Cart cr = new Cart(null);
		
		String result = Cart.price("Candy", 10);
		
		assertEquals("Candy", result);
	}
	
	@Test
	public void patternTestTwo() {
		Cart cr = new Cart(null);
		
		String result = Cart.nameOfItem("Candy", "Flour");
		
		assertEquals("Candy Flour", result);
		
	}
	
	

	
	
	

}
