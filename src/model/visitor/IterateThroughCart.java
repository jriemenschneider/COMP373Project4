package model.visitor;

public class IterateThroughCart{
//we need to iterate through the cart to calculate the total tax on all the items!(the extra functionality the visitor will be adding)
	
	public double calcTax(Visitable[] cartItems) {
		Visitor visitor = new TaxVisitor();
		double taxTotal = 0;
		for(Visitable item: cartItems) {
			taxTotal = taxTotal + item.accept(visitor);
		}
		return taxTotal;
	}
	
	public double calcSubTotal(Visitable[] items)  
    { 
        Visitor visitor = new TaxVisitor(); 
        double subtotal=0; 
        for(Visitable item : items) 
        { 
            subtotal = subtotal + item.accept(visitor); 
        } 
        return subtotal; 
    } 
}
