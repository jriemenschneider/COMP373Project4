package model.visitor;

public interface Visitable {
	public float accept(Visitor visitor);
}
