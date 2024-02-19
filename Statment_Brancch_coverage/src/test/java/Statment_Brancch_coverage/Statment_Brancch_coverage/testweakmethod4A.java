package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testweakmethod4A {
	@Test
    public void testweakmethod_4A() {
    	assertEquals(5, WeakClass.weakMethod4(10, 2)); 
        assertEquals(10, WeakClass.weakMethod4(4, 2)); 

    	

    }

}
