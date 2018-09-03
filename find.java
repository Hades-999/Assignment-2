import java.util.*;
class find
{
	public static void main(String args[])
	{
		int[] a=new int[10];
		int i,j,s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 10 numbers:");
		for(i=0;i<10;i++)
			a[i]=sc.nextInt();
		for(i=0;i<10;i++)
		{
			for(j=0;j<=9-i-1;j++)
			{
				if(a[j]<a[j+1])
				{
					s=a[j];
					a[j]=a[j+1];
					a[j+1]=s;
				}
			}
		}
		System.out.println("The 2nd largest element is:"+a[1]);
	}
}