import java.util.*;
class Rectangle
{
	int length,breadth;
	public void calculateArea()
	{
		int area=length*breadth;
		System.out.println("Area of Rectangle="+area);
	}
	public static void main(String args[])
	{
		Rectangle r=new Rectangle();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter values of length and breadth:");
		r.length=sc.nextInt();
		r.breadth=sc.nextInt();
		r.calculateArea();
	}
}