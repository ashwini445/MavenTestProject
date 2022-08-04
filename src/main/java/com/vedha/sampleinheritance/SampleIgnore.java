package com.vedha.sampleinheritance;

public class SampleIgnore {
String s1="Amireddy";
String s="Amireddy";
String s2="amireddy";
String s3="Ashwini";
String name="Rayalapuram divya reddy";
String fullname="Rayalapuram divya reddy siddipet";
String  name1="  kalva sirisha  ";
public void equalIgnore()
{
	System.out.println("both s1 and s2 are same it results:"+ s.equalsIgnoreCase(s1));
	System.out.println("case is ignored:"+ s1.equalsIgnoreCase(s2));
	System.out.println("both s1 and s3 are not same:"+ s1.equalsIgnoreCase(s3));
}
public void spilt()
{
	String[] strr=name.split(" ");
	for(String words:strr)
	{
		System.out.println("spliting the words excluding white spaces: "+words);
	}
}
public void spilt1()
{
	String[] str=fullname.split(" ",2);
	for(String words:str)
	{
		System.out.println("spliting the limited number of strings in an array  as per the limit: "+words);
	}
}

public void upperCase()
{
		System.out.println("converting string to uppercase: "+s2.toUpperCase());
}
public void lowerCase()
{
	System.out.println("converting string to uppercase: "+s1.toLowerCase());
}
public void sampleTrim()
{
	System.out.println(name1);
	System.out.println(name1.trim());
}
public void sampleTrim1()
{
	int len=name1.length();
	System.out.println(len);
	String tr=name1.trim();
	System.out.println(tr.length());
	System.out.println(tr);
}
}
