package Array;

public class PrimeCountDemo {
	public static void main(String args[]) {
		int arr[] = { 2, 5, 6, 8, 11, 14, 17, 18, 20 };
		for(int i=0;i<arr.length;i++)
		{
		boolean flag=true;
			for(int j=2;j<i;j++)
			{
				if(arr[i]%j==0)
				{
					flag=false;
					break;
				}
			}
		
			if(flag)
				System.out.println(arr[i] + " is a Prime number");
			else
				System.out.println(arr[i] + " is not a Prime number");
		
		}
	
	}
	
}