import java.util.*;
class Question_1
{
	public static void main(String args[])
	{
		ArrayList<String> colors= new ArrayList<String>();
		colors.add("Red");
		colors.add("Yellow");
		colors.add("Green");
		colors.add("Blue");
		
		System.out.println("Array List: "+ colors);
		System.out.println("Iteration using for-each loop");
		for(int i=0; i<colors.size(); i++)
		{
			System.out.print(colors.get(i));
			System.out.print(" , ");
		}
	}
}