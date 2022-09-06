package Condition;

public final class ConditionAnd<T> extends Condition<T>{
	
	private Condition<T> c1;
	private Condition<T> c2;
	
	public ConditionAnd(Condition<T> c1, Condition<T> c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public boolean satisfies(T obj) {
		return c1.satisfies(obj) && c2.satisfies(obj);
	}
}
