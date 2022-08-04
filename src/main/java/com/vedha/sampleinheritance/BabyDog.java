package com.vedha.sampleinheritance;

public class BabyDog extends Dog {
	String behaviour;
	public BabyDog(String name, int weight, String sound, String behaviour) {
		super(name, weight, sound);
		this.behaviour=behaviour;
	}
	public void eat()
	{
		super.bark();
		System.out.println("behaviour: "+behaviour);
	}
}
