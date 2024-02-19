package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testweakmethod2A {
	 @Test(expected=java.lang.ArithmeticException.class)
	    public void testweakmethod_2A() {
	        assertEquals(4, WeakClass.weakMethod2(4, 0)); // תקלת חלוקה באפס

	    	

	    }

}
