
	package model.test;

	import static org.junit.jupiter.api.Assertions.*;

	import org.junit.jupiter.api.Test;

	import model.visitor.*;

	class TestVisitor {
		OrderCart oC = new OrderCart("Tofu", 45.50);
		Visitable[] items;
		IterateThroughCart iTC = new IterateThroughCart();
		
		@Test 
		void setUp() {
		}
		
		@Test
		void tearDown() throws Exception{	
		}
		
		@Test
		void testAddItem() {
			//test to see if the add item in orderCart works
			oC.addItem("Bananas", 5.75);
			oC.getPrice();
			double tot = oC.getTotal();
			double expT = (5.75);
			assertEquals( expT, tot);
		}
		
		@Test
		void testGetPrice() {
			double expP = oC.getPrice();
			double price = 45.50; //price of tofu entered above that is related to this object
			assertEquals(price, expP);
		}
		
		@Test
		void testGetName() {
			String expN = oC.getItemName();//should be tofu
			String name = "Tofu";
			assertEquals(expN, name);
		}
		
		//see if the total with tax works each time and maybe do multiple versions with different prices
		@Test
		void testPattern() {
			Visitable[] items = new Visitable[] {new OrderCart("Oranges", 7.00), new OrderCart("Clorox Wipes", 80.00), new OrderCart("Toilet Paper One Square",  100.50)};
	        double taxTotal = iTC.calcTax(items);//gets total of all items
	        assertEquals(198.75, taxTotal);
		}
		
		@Test
		void testPattern2() {
			Visitable[] items = new Visitable[] {new OrderCart("Coca Cola", 10.00), new OrderCart("Oat Milk", 20.00), new OrderCart("Hand Sanitizer",  100.00), new OrderCart("Spinach", 25.00)};
	        double taxTotal = iTC.calcTax(items);//gets total of all items
	        assertEquals(164.30 , taxTotal);
		}
		
		@Test
		void testPattern3() {
			Visitable[] items = new Visitable[] {new OrderCart("Oat Milk", 20.00), new OrderCart("Vitamin B12", 10.00), new OrderCart("Vitamin C",  10.00), new OrderCart("Spinach", 20.00), new OrderCart("Water", 100.00), new OrderCart("Avocado", 6.50)};
	        double taxTotal = iTC.calcTax(items);//gets total of all items
	        assertEquals(176.49 , taxTotal);
		}
	}

