package Looping;

import java.util.Scanner;

public class AssignmentElseIf {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);  
	    System.out.println("Enter Bill amount");

	    int amt= sc.nextInt(); 
	    
	    if(amt<=300 )
		    {
	            int tax_amt=50;
		        System.out.println("Total amount including tax is : "+(amt+tax_amt));
		    }
		else if(amt>300 && amt<=500)
			{
		    	int tax_amt=20;
				System.out.println("Total amount including tax is : "+(amt+tax_amt));
			}
		else if(amt>500 && amt<=1000)
		{
		    	int tax_amt=10;
		    	System.out.println("Total amount including tax is : "+(amt+tax_amt));
			}
		else if(amt>1000)
		{
			System.out.println("No Tax");
		}
		else {
			System.out.println("Invalid amount");
		}
	}
}
