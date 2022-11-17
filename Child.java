import java.util.Scanner;
class GrandParents
{
	String grandFatherName;
	String grandMotherName;
	
	
	GrandParents(String grandFatherName, String grandMotherName)
	{
	    this.grandFatherName=grandFatherName;
		this.grandMotherName=grandMotherName;
		System.out.println("Grand Father's name is: "+grandFatherName);
		System.out.println("Grand Mother's name is: "+grandMotherName);
	}
	
}
class Parent extends GrandParents
{
	String FatherName;
	String MotherName;
	
	Parent(String FatherName, String MotherName,String grandFatherName, String grandMotherName)
	{
		super(grandFatherName,grandMotherName);
		this.FatherName=FatherName;
		this.MotherName=MotherName;
		System.out.println("Father's name is: "+FatherName);
		System.out.println("Mother's name is: "+MotherName);
	
	}
	Parent(String grandFatherName, String grandMotherName) 
	{
		super(grandFatherName,grandMotherName);
	}
}
class Child extends Parent
{
	Child(String FatherName, String MotherName,String grandFatherName, String grandMotherName)
	{
		super(FatherName,MotherName,grandFatherName,grandMotherName);
	}
	
	public static void main(String args[])
	{
		Child c= new Child("Aviral","Anjana","Sailesh","Apurva");
		System.out.println(c.FatherName+" "+c.MotherName+" "+c.grandFatherName+" "+c.grandMotherName);
	}
}