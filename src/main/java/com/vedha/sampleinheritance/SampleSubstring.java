package com.vedha.sampleinheritance;

public class SampleSubstring {
String s="Ashwini Amireddy";
String s1="kothapet";
public void subString()
{
	System.out.println("substring: "+s.substring(2));
}
public void subString1()
{
	System.out.println("substring from beginindex and en index: "+s.substring(1, 5));
}
public void containEXample()
{
	System.out.println("specifies the characters to search Amireddy is :"+s.contains("Amireddy"));
	System.out.println("specifies the characters to search Ashwini is :"+s.contains("ashwini"));
	System.out.println("concatenation of two strings: "+s.concat(s1));
	System.out.println("concatenation of two strings with space: "+s.concat(" ").concat(s1));
	}
public void replace()
{

	System.out.println("replace old char to new char : "+s.replace('i', 'z'));
	System.out.println("replace old char sequence to new char sequence: "+s.replace("Ashwini", "Aadvitha"));
}
}
