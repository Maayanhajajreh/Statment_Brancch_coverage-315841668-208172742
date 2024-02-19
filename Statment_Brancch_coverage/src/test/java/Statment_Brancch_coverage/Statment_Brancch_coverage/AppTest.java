package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
	public void b_bigger_than_a(){
        int a = 2;
        int b = 4;
        
     
        int expected =2;
        int result = App.Add(a, b);
        assertEquals(expected, result,0.001);
        
    }
    @Test
   	
    public void a_bigger_than_b(){
           int a = 4;
           int b = 2;
           
        
           int expected =2;
           int result = App.Add(a, b);
           assertEquals(expected, result,0.001);
           
       }
   
    @Test
	public void a_thesame_b(){
        int a = 1;
        int b = 1;
        
     
        int expected =0;
        int result = App.Add(a, b);
        assertEquals(expected, result,0.001);
        
    }
    @Test
    public void testWeakMethod1A() {
    	
        assertEquals(15, WeakClass.weakMethod1(12, 0)); // תקלת חלוקה באפס
    }
    @Test
    public void testweakmethod1B() {
		assertEquals(6, WeakClass.weakMethod1(5, 5));
		assertEquals(25, WeakClass.weakMethod1(11, 11));

		
		
	}
    @Test
    public void testweakmethod2A() {
        assertEquals(4, WeakClass.weakMethod2(4, 0)); // תקלת חלוקה באפס

    	

    }
    @Test
    public void testweakmethod2B() {
        assertEquals(17, WeakClass.weakMethod2(11, 1)); 
        assertEquals(23, WeakClass.weakMethod2(7, 6)); 
    }
    @Test
    public void testweakmethod3A() {
    	assertEquals(5, WeakClass.weakMethod3(6, 3)); 
        assertEquals(10, WeakClass.weakMethod3(4, 2)); 

    	

    }
    @Test
    public void testweakmethod3B() {
        assertEquals(14, WeakClass.weakMethod3(14, 0)); 
        assertEquals(10, WeakClass.weakMethod3(4, 2)); 

    	
    }
    @Test
    public void testweakmethod4A() {
    	assertEquals(5, WeakClass.weakMethod4(10, 2)); 
        assertEquals(10, WeakClass.weakMethod4(4, 2)); 

    	

    }
    @Test
    public void testweakmethod4B() {
        assertEquals(6, WeakClass.weakMethod4(6, 0)); 

    	
}
}
    
