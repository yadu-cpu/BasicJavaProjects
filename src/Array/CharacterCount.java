package Array;

public class CharacterCount {
	
	public static void main(String args[])
	{
		char arr[]= {'I','a','m','A','j','a','v','a','Q','A'};
		int count=0;
		for(char ch=0;ch<arr.length;ch++)
		{
			if(arr[ch]=='a' || arr[ch]=='A')
				count=count+1;
		}
		System.out.println("Total occurrance " + count);
		
	}	
	}


