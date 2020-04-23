package model.visitor;

public class OrderCart implements Visitable{
	double total;
	double price;
	String nameOfItem;
	double newTotal; 
	int newNumOfItems;
	double tax;
	
	public void accept(Visitor visitor) {
		visitor.visit(this);//visits the object of this class
	}
	
	public double getTotal() {
		return total;
	}
	
	public double addItem(String name, double price) {
		total+= price;//add new item's cost to the total
		return price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double taxOnCart() {
		
		return tax;
	}
}
