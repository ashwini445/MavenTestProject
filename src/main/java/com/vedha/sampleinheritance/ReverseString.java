package com.vedha.sampleinheritance;

public class ReverseString {
	String string="vedha automation";
	String reveresedstring="";
	public void revString()
	{
		for(int i=string.length()-1;i>=0;i--)
		{
			reveresedstring=reveresedstring+string.charAt(i);
		}
		System.out.println("originl string :"+string);
		System.out.println("reverse string:"+reveresedstring);
	}
}
