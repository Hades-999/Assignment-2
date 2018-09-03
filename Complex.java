import java.util.*;
class Complex
{
	int real,imaginary;
	public void display()
	{
		System.out.println(real+"+i"+imaginary);
	}
	public static void main(String args[])
	{
		Complex c=new Complex();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the real and imaginary parts of the number:");
		c.real=sc.nextInt();
		c.imaginary=sc.nextInt();
		c.display();
	}
}