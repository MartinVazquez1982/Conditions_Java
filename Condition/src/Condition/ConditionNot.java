package Condition;

public final class ConditionNot<T> extends Condition<T>{
	
	private Condition<T> c;
	
	public ConditionNot(Condition<T> c) {
		this.c = c;
	}

	@Override
	public boolean satisfies(T obj) {
		return ! c.satisfies(obj);
	}
}
