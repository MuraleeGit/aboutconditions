// If condition true

package com.k2js.aboutconditions.practice;
 
class Dprog{
	public static void m(){
		if (!true){
			System.out.println("I am inside if");
		}
	
	}
}

class DprogTest{
	
	public static void main(String...abc){
		System.out.println("I am in main class");
		Dprog.m();
		System.out.println("I am in main ended");
	}
}