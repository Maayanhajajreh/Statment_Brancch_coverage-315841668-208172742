package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testweakmethod1B {

    @Test
    public void testweakmethod_1B() {
		assertEquals(6, WeakClass.weakMethod1(5, 5));
		assertEquals(25, WeakClass.weakMethod1(11, 11));

		
		
	}

}
