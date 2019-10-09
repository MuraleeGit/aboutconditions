// If condition using boolean

package com.k2js.aboutconditions.practice;
 
class Fprog{
	
	public static void m(){
		int i=15;
		boolean c=(i%2==0);
		if(c){
			System.out.println("The entred number is even " +i);
		}
		else{
			System.out.println("The entered number is odd " +i);
		}
	}
}

class FprogTest{
	
	public static void main(String...abc){
		System.out.println(" Main method started");
		
		Fprog.m();	
		
		System.out.println(" Main method Ended");
		
	}
}