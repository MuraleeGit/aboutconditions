// If condition true

package com.k2js.aboutconditions.practice;
 
class Bprog{
	public static void m(){
		if (false){
			System.out.println("I am inside if");
		}
	
	}
}

class BprogTest{
	
	public static void main(String...abc){
		System.out.println("I am in main class");
		Bprog.m();
		System.out.println("I am in main ended");
	}
}