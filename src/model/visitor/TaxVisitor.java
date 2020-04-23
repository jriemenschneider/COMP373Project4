package model.visitor;

public class TaxVisitor implements Visitor{
	double taxOfItems;
	@Override
	public double visit(OrderCart ordercart) {
		taxOfItems = (ordercart.getPrice()* 1.06); //the tax percentage in MI is 6%! So this gives the total of item including tax.
		System.out.println("Item: " + ordercart.getItemName() + "	Price Before Tax: " + ordercart.getPrice() + "		Tax: " + taxOfItems);
		return taxOfItems;
	}//adds up all the tax on the items so we can get the actual checkout total
	
	
}
