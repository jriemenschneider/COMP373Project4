package model.visitor;

public class Cart {
	
	public Cart (Builder builder) {
		this.total = builder.total;
		this.price = builder.price;
		this.nameOfItem = builder.nameOfItem;
	}
	
	public static class Builder {
		private double total;
		private double price;
		private String nameOfItem;
		
		public static Builder newInstance() {
			return new Builder();
		}
		
		private Builder() {
			
		}
		
		public Builder setTotal(double total) {
			
			this.total = total;
			return this;
		}
		
		public Builder setPrice(double price) {
			
			this.price = price;
			return this;
		}
		
		public Builder setNameOfItem(String nameOfItem) {
			
			this.nameOfItem = nameOfItem;
			return this;
		}
		
		public Cart build() {
			return new Cart(this);
		}
		
	}
	public String toString() {
		return "total = " + this.total + ", price = " + this.price + ", name of item = " + this.nameOfItem;
	}
}