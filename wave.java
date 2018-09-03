class wave
{
	public static void main(String args[])
	{
		int a[]={1,2,3,4,5,6,7,8,9,10};
		int[] arr=new int[10];
		int i,j=0,s=1;
		for(i=0;i<9;i++)
		{
			if((i+1)%2==0)
			{
				arr[j]=a[i];
				j=j+2;
			}
			else
			{
				arr[s]=a[i];
				s=s+2;
			}
		}
		for(i=0;i<10;i++)
			System.out.println(arr[i]);
	}
}