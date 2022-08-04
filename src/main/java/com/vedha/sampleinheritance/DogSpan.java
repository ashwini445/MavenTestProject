package com.vedha.sampleinheritance;

public class DogSpan extends Animal {
	int lifeSpan;
	public DogSpan(String name, int weight, int lifeSpan) {
		super(name, weight);
	this.lifeSpan=lifeSpan;	
	}
public void lifeSpan()
{
	super.eat();
	System.out.println("lifeSpan: "+lifeSpan);
	
}
}
