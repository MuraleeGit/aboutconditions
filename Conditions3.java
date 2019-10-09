// If condition true

package com.k2js.aboutconditions.practice;
 
class Cprog{
	public static void m(){
		if (!false){
			System.out.println("I am inside if");
		}
	
	}
}

class CprogTest{
	
	public static void main(String...abc){
		System.out.println("I am in main class");
		Cprog.m();
		System.out.println("I am in main ended");
	}
}