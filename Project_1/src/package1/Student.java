package package1;

public class Student
{ // Curly braces are boundary or Body of the class
	
	int a;
	public void display()
	{
		//boundary of the method
		System.out.println("Welcome to all of you");
	}
	public static void main(String[] args)
	{
		Student abc = new Student ();//Third Pillar
		abc.display(); //calling the method
		abc.display(); // calling the method
		abc.a=123; // calling the variable
		System.out.println(abc.a); // calling the variable + printing
		abc.a=456; // calling variable
		System.out.println(abc.a); // calling the variable + printing
				
	}
}
