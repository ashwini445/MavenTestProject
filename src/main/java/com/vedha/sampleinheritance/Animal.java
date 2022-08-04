package com.vedha.sampleinheritance;

public class Animal {
	
	String name;
	 int weight;
	 
	 public Animal(String name, int weight) {
		this.name=name;////we are using this keyword to distinguish local variable and instance variable.
		this.weight=weight;
	}
	 public void eat()
	 {
		 System.out.println("Dog name: "+name+" weight: "+weight);
	 }
}
