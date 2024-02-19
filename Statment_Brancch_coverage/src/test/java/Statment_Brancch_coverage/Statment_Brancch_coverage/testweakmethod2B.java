package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testweakmethod2B {
	@Test
    public void testweakmethod_2B() {
        assertEquals(17, WeakClass.weakMethod2(11, 1)); 
        assertEquals(23, WeakClass.weakMethod2(7, 6)); 
    }

}
