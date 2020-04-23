package model.visitor;

public class TaxVisitor implements Visitor{
	double taxTotal;
	
	public void visit(OrderCart ordercart) {
		taxTotal += ordercart.getPrice() * .06; //the tax percentage in MI is 6%!
	}//adds up all the tax on the items so we can add it to the total at the end
	
	public double getTaxTotal() {
		return taxTotal;
	}//grab the tax amount
}
