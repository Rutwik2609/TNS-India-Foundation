package com.tnsif.daysix.usingFinal;

final class FinalClass{
	
	
	void show ()
	 {
		 System.out.println("Final Class  casnnot be inherited");
	 }
}


//class A extends FinalClass{
//	
//}

public class FinalClassDemo {

	public static void main(String[] args) {

		FinalClass f1=new FinalClass();
		f1.show();
	}

}
