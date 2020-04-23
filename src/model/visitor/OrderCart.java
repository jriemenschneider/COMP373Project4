package model.visitor;

public class OrderCart implements Visitable{
	float total;
	float price;
	String nameOfItem;
	float newTotal; 
	int newNumOfItems;
	float tax;
	
	public OrderCart(String itemName, float price) {
		this.price = price;
		this.nameOfItem = itemName;
		
	}
	
	public float accept(Visitor visitor) {
		return visitor.visit(this);//visits the object of this class
	}
	
	public float getTotal() {
		return total;
	}
	
	public float addItem(String name, float price) {
		total+= price;//add new item's cost to the total
		return price;
	}//may not need for this implementation
	
	public float getPrice() {
		return price;
	}
	
	public String getItemName() {
		return nameOfItem;
	}
	
}
