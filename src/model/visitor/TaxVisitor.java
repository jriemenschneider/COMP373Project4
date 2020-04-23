package model.visitor;

public class TaxVisitor implements Visitor{
	float taxOfItem;
	
	@Override
	public float visit(OrderCart ordercart) {
		taxOfItem = (float) (ordercart.getPrice() * 0.06); //the tax percentage in MI is 6%!
		System.out.println("Item: " + ordercart.getItemName() + "	Price without tax: " + ordercart.getPrice() + "		Tax: " + taxOfItem);
		return taxOfItem;
	}//adds up all the tax on the items so we can add it to the total at the end
	
}
