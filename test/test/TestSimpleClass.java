package test;

import org.junit.Assert;
import org.junit.Test;

public class TestSimpleClass{
	@Test
	public void testField() {
		SimpleClass sClass = new SimpleClass();
		int field = 2;
		sClass.setField(field);
		Assert.assertEquals( field, sClass.getField());
	}
	@Test
	public void testFunc() {
		SimpleClass sClass = new SimpleClass();
		int field = 2;
		sClass.setField(field);
		Assert.assertEquals( field*field, sClass.func( field));	
	}
}
