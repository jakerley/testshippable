package test;

public class SimpleClass {
	private int field;

	public int getField() {
		return field;
	}

	public void setField(int field) {
		this.field = field;
	}
	
	public int func( int seed) {
		return seed * field;
	}
}
