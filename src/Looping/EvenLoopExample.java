package Looping;

public class EvenLoopExample {
public static void main(String args[])
{
	int sum=0;
	for(int i=0;i<15;i++)
	{
		if(i % 2 == 0)
			sum=sum+i;
		else 
			continue;
	}
	System.out.println("Sum of even numbers is " + sum);
}
}
