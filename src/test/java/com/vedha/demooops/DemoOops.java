package com.vedha.demooops;


import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.vedha.sampleinheritance.AbstractCircle;
import com.vedha.sampleinheritance.BabyDog;
import com.vedha.sampleinheritance.Display;
import com.vedha.sampleinheritance.Dog;
import com.vedha.sampleinheritance.DogSpan;
import com.vedha.sampleinheritance.EncapStudentInfo;
import com.vedha.sampleinheritance.PolyOverloading;
import com.vedha.sampleinheritance.ReverseString;
import com.vedha.sampleinheritance.SampleCharAt;
import com.vedha.sampleinheritance.SampleIgnore;
import com.vedha.sampleinheritance.SampleSubstring;
import com.vedha.sampleinheritance.Son;


public class DemoOops {
	
@Test(description = "single inheritance :: Here subclass inherit the properties of super class",priority=1,groups="inheritance concepts" )
	public void demoInheritance()
	{
	Dog details=new  Dog("labo", 30, "barking");
	details.bark();
	}
@Test(description = "multi level inheritance :: Here classes inherit the properties of other classes",priority=2,groups="inheritance concepts")
public void multi()
{
	BabyDog babyDog=new BabyDog("labrador retriever", 25, "barking", "weeping");
	babyDog.eat();
}
@Test(description = "heirarchical inheritance :: Here one or more subclasses inherit the properties of super classes",priority=3,groups="inheritance concepts")
public void heirarcy()
{
	DogSpan dogSpan=new DogSpan("pitbull", 25, 12);
	dogSpan.lifeSpan();
}

@Test(description = "encapulation ::Variables of the class will be hidden from other classes and can be accessed  only through the methods ")
public void studentInfo()
{
	EncapStudentInfo std=new EncapStudentInfo();
	std.setId(12);
	std.setName("ashwini");
	std.setRollNum(1);
	std.setCname("seventh");
	System.out.println(std.getId());
	System.out.println(std.getName());
	System.out.println(std.getRollNum());
	System.out.println(std.getCname());
}
@Test(description = "overloading ::class will have multiple methods with same name but different type of parameters,order of parameters,number of parametrs ")
public void overload()
{
	PolyOverloading addition=new PolyOverloading();
	addition.sum(2, 6);
	addition.sum(2, 6,1);
	addition.sum(5.5f, 2);
	addition.sum(5, 2.2f);
}
@Test(description = "overriding ::subclass has same methods as declared in parent class")
public void override()
{
	Son obj=new  Son();
	obj.property();
		
}
@Test(description = "abstraction ::Here hiding the implementation details of the abstarction and showing only functionality")
public void abstractShape()
{
	AbstractCircle obj=new AbstractCircle();
	obj.draw();
}
@Test(description = "interface ::Here creating an object to display class, display class implements the printable and showable interface")
public void displayInterface()
{
	Display obj=new Display();
	obj.print();
	obj.show();
}
@Test(description = "charAt() ::char value at the given index number")
public void charAt()
{
	SampleCharAt obj=new SampleCharAt();
	obj.charindex();
	obj.charindex1();
	obj.charindex2();
	obj.length();
	obj.reverese();
}
@Test
public void subString()
{
	SampleSubstring obj=new SampleSubstring();
	obj.subString();
	obj.subString1();
	obj.containEXample();
	obj.replace();
}
@Test
public void ignore()
{
	SampleIgnore det=new SampleIgnore();
	det.equalIgnore();
	det.spilt();
	det.spilt1();
	det.upperCase();
	det.lowerCase();
	det.sampleTrim();
	det.sampleTrim1();
}
@Test
public void randomEx()
{
	String  num=RandomStringUtils.randomNumeric(6);
			System.out.println(num);
	String gml=RandomStringUtils.randomAlphabetic(6)+"@gmail.com";
	System.out.println(gml);
	System.out.println(RandomStringUtils.randomAlphanumeric(5));	
}
@Test
public void currentDate()
{
	Date date=new Date();
	SimpleDateFormat dateformat=new SimpleDateFormat("ddMMyyyy,HHMMss");
	System.out.println(dateformat.format(date));
	
}
@Test
public void reverseString()
{
	ReverseString reverseString=new ReverseString();
	reverseString.revString();
}

}
