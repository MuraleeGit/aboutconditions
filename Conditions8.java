// The given number is even or odd.

package com.k2js.aboutconditions.practice;

class Evenodd{
	
	public static void m(Object o){
		
		String value= String.valueOf(o);
		
		int i = Integer.parseInt(value);
		
		if(i%2==0){
			System.out.println("The given numbr is even");
		}
		else{
			System.out.println("The given number is odd");
		}
	}
}

class EvenoddTest{
	 
	 public static void main(String...abc){
		 Evenodd.m(10);
		 Evenodd.m("15");
		 //Evenodd.m("Abc"); if you eecute this it will throw run time exception.
		 
	 }
	
}

/*
D:\seleniumtrainingbyJitendra\Practicals\Javapracticals\aboutconditions\src>java -cp ..\bin  com.k2js.aboutconditions.practice.EvenoddTest
The given numbr is even
The given number is odd
Exception in thread "main" java.lang.NumberFormatException: For input string: "Abc"
        at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        at java.lang.Integer.parseInt(Integer.java:580)
        at java.lang.Integer.parseInt(Integer.java:615)
        at com.k2js.aboutconditions.practice.Evenodd.m(Conditions8.java:11)
        at com.k2js.aboutconditions.practice.EvenoddTest.main(Conditions8.java:27)
		*/
		