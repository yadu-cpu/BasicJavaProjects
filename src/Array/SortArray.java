package Array;

public class SortArray { 
	public static void main(String args[])
	{
		int arr[]= {20,14,48,9,5,3,25,7};
		int temp;
		System.out.println("Given array is");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(" " + arr[i]);
			
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
			        arr[i]=arr[j];
			        arr[j]=temp;
				}
			}
		}
		System.out.println("Sorted array is");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(" " + arr[i]);
			
		}
	}

}
