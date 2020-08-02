package Looping;

public class OddForLoop {

	public static void main(String args[])
	{
		System.out.println("Odd number List ");
		System.out.println("=================");
		for(int i=30;i>0;i--)
		{
			if(i % 2 != 0)
				System.out.println("     "+ i);
			else 
				continue;
		}
	}
}

