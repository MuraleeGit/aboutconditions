// If condition true

package com.k2js.aboutconditions.practice;
 
class Aprog{
	public static void m(){
		if (true){
			System.out.println("I am inside if");
		}
	
	}
}

class AprogTest{
	
	public static void main(String...abc){
		System.out.println("I am in main class");
		Aprog.m();
		System.out.println("I am in main ended");
	}
}