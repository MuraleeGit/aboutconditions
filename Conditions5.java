// If condition true

package com.k2js.aboutconditions.practice;
 
class Eprog{
	
	public static void m(){
		int i=15;
		
		if(i%2==0){
			System.out.println("The entred number is even " +i);
		}
		else{
			System.out.println("The entered number is odd " +i);
		}
	}
}

class EprogTest{
	
	public static void main(String...abc){
		System.out.println(" Main method started");
		
		Eprog.m();	
		
		System.out.println(" Main method Ended");
		
	}
}