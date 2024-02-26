package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EX_5 {

@Test
public void testcheckOut1() {
double cart=2500;
int creditRating=10;
String statuts = "gold";
boolean expectedResult=true;
boolean result = CheckoutApproval.checkOut(cart,creditRating,statuts);
assertEquals(expectedResult, result);
}
@Test
public void testcheckOut2() {
double cart=3700;
int creditRating=651;
String statuts = "gold";
boolean expectedResult=true;
boolean result = CheckoutApproval.checkOut(cart,creditRating,statuts);

assertEquals(expectedResult, result);
}@Test
public void testcheckOut3() {
double cart=4000;
int creditRating=300;
String statuts = "gold";
boolean expectedResult=false;
boolean result = CheckoutApproval.checkOut(cart,creditRating,statuts);

assertEquals(expectedResult, result);
}

@Test
public void testcheckOut4() {
double cart=1000;
int creditRating=15;
String statuts = "silver";
boolean expectedResult=true;
boolean result = CheckoutApproval.checkOut(cart,creditRating,statuts);

assertEquals(expectedResult, result);
}
@Test
public void testcheckOut5() {
double cart=3000;
int creditRating=900;
String statuts = "silver";
boolean expectedResult=true;
boolean result = CheckoutApproval.checkOut(cart,creditRating,statuts);

assertEquals(expectedResult, result);
}
@Test
public void testcheckOut6() {
double cart=5000;
int creditRating=100;
String statuts = "silver";
boolean expectedResult=false;
boolean result = CheckoutApproval.checkOut(cart,creditRating,statuts);

assertEquals(expectedResult, result);
}
@Test
public void testcheckOut7() {
double cart=1000;
int creditRating=1;
String statuts = "diamond";
boolean expectedResult=true;
boolean result = CheckoutApproval.checkOut(cart,creditRating,statuts);

assertEquals(expectedResult, result);
}
@Test
public void testcheckOut8() {
double cart=1600;
int creditRating=900;
String statuts = "diamond";
boolean expectedResult=true;
boolean result = CheckoutApproval.checkOut(cart,creditRating,statuts);

assertEquals(expectedResult, result);
}

@Test
public void testcheckOut9() {
double cart=5000;
int creditRating=100;
String statuts = "diamond";
boolean expectedResult=false;
boolean result = CheckoutApproval.checkOut(cart,creditRating,statuts);

assertEquals(expectedResult, result);
}
}
