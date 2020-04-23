package model.visitor;

public class OrderCart implements Visitable{
	static double total;
	double price;
	String nameOfItem;
	double newTotal; 
	int newNumOfItems;
	double tax;
	
	public OrderCart(String itemName, double price) {
		this.price = price;
		this.nameOfItem = itemName;
		
	}
	
	public double accept(Visitor visitor) {
		return visitor.visit(this);//visits the object of this class
	}
	
	public static double getTotal() {
		return total;
	}
	
	public double addItem(String name, double price) {
		total+= price;//add new item's cost to the total
		return price;
	}//may not need for this implementation
	
	public double getPrice() {
		return price;
	}
	
	public String getItemName() {
		return nameOfItem;
	}
	
}
