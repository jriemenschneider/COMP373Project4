package model.visitor;

public class TaxVisitor implements Visitor{
	double taxOfItem;
	@Override
	public double visit(OrderCart ordercart) {
		taxOfItem = (ordercart.getPrice() * 1.06); //the tax percentage in MI is 6%!
		System.out.println("Item: " + ordercart.getItemName() + "	Price Before Tax: " + ordercart.getPrice() + "		Total of Item with Tax: " + taxOfItem );
		return taxOfItem;
	}//adds up all the tax on the items so we can add it to the total at the end
	
	
}
