package com.vedha.sampleinheritance;

public class SampleCharAt {
String name="Aadvitha Amireddy";
int str=name.length();
public void charindex()
{
	char ch=name.charAt(3);
	System.out.println("char value at the given index number: "+ch);
}
public void charindex1()
{
	System.out.println("fetching last character of the string: "+ name.charAt(str-1));
}
public void charindex2()
{
	for(int i=0;i<=name.length()-1;i++)
	{
		if(i%2!=0)
		{
			System.out.println("char at  "+i+" odd place is "+name.charAt(i));//returns the odd char length place
		}
	}
}
public void length()
{
	System.out.println("length of the string "+name.length());//returns the length of the string
}
public void reverese()
{
	System.out.println("reverse of a string "+""+name+""+"is: ");
	for(int i=0;i<str;i++)
	{
		System.out.print(name.charAt(name.length()-i-1));
	}
	System.out.println();
}

}
