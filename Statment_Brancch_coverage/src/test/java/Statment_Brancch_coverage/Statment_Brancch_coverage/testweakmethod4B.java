package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testweakmethod4B {
	 @Test(expected=java.lang.ArithmeticException.class)
	    public void testweakmethod_4B() {
	        assertEquals(6, WeakClass.weakMethod4(6, 0)); 

	    	
	}
}
