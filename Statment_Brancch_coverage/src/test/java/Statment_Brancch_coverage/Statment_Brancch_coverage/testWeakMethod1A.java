package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testWeakMethod1A {
	 @Test(expected=java.lang.ArithmeticException.class)
	    public void testWeakMethod_1A() {
	    	
	         WeakClass.weakMethod1(12, 0); // תקלת חלוקה באפס
	    }

}
