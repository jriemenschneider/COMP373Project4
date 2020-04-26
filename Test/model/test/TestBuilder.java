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
		
		String result = Cart.setPrice(10);
		
		assertEquals(10, result);
	}
	
	@Test
	public void patternTestTwo() {
		Cart cr = new Cart(null);
		
		String result = Cart.setNameOfItem("Candy");
		
		assertEquals("Candy", result);
		
	}
	
	

	
	
	

}
