package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testweakmethod3B {
	 @Test(expected=java.lang.ArithmeticException.class)
	    public void testweakmethod_3B() {
	        assertEquals(14, WeakClass.weakMethod3(14, 0)); 
	        assertEquals(10, WeakClass.weakMethod3(4, 2)); 

	    	
	    }

}
