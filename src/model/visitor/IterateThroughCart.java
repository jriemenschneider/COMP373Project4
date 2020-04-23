package model.visitor;
import java.util.*;

public class IterateThroughCart{
//we need to iterate through the cart to calculate the total tax on all the items!(the extra functionality the visitor will be adding)
	private ArrayList<Visitable> cartItems;
	public double calcTax() {
		TaxVisitor visitor = new TaxVisitor();
		for(Visitable item: cartItems) {
			item.accept(visitor);
		}
		double taxTotal = 0;
		//visitor.getTaxTotal();
		return taxTotal;
	}
}
