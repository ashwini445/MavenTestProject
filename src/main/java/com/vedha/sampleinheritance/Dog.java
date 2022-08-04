package com.vedha.sampleinheritance;

public class Dog extends Animal {
	String sound;
	public Dog(String name, int weight,String sound) {
		super(name, weight);
		this.sound=sound;
		
		
	}
	public void bark()
	{
		super.eat();
		System.out.println("sound: "+ sound);
	}
}
