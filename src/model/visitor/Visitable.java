package model.visitor;

public interface Visitable {
	public void accept(Visitor visitor);
}
