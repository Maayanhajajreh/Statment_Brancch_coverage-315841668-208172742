package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testweakmethod2B {
	@Test
    public void testweakmethod_2B() {
        assertEquals(5, WeakClass.weakMethod2(6, 2)); 
        assertEquals(24, WeakClass.weakMethod2(16, 2)); 
        assertEquals(8, WeakClass.weakMethod2(12, 2)); 
        assertEquals(24, WeakClass.weakMethod2(12, 6)); 


        
    }

}
