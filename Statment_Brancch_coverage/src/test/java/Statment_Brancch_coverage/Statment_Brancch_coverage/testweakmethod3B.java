package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testweakmethod3B {
	 @Test(expected=java.lang.ArithmeticException.class)
	    public void testweakmethod_3B() {
	        assertEquals(10, WeakClass.weakMethod3(4, 2)); 
	        assertEquals(18, WeakClass.weakMethod3(15, 3)); 
	        WeakClass.weakMethod3(14, 0); 

	        


	    	
	    }

}
