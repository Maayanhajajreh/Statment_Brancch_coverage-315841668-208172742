package Statment_Brancch_coverage.Statment_Brancch_coverage;

public class WeakClass {
	
	
public static int weakMethod1 (int a,int b) {
	if ((b==0)|| a<10) {
		a=a/b;
	}
	else {
		a=a+3;
	}
	return a + b;
	
}
public static int weakMethod2 (int a,int b) {
	if (b<5  && a<15) {
		a=a/b;
	}
	else {
		a=a+6;
	}
	return a + b;
	
}
public static int weakMethod3 (int a,int b) {
	if (a<10 || b==0) {
		a=a/b;
	}
	if (a<5) {
		a=a+6;
	}
	return a + b;
}

public static int weakMethod4 (int a,int b) {
	if (b<5  && a<15) {
		a=a/b;
	}
	else {
		a=a+6;
	}
	return a + b;
	
}
}
	