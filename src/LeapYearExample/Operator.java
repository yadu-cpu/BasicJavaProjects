package LeapYearExample;

import java.util.Scanner;

public class Operator {
		public static void main(String args[])
		{
			int year;
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Enter year to be checked");
				year=sc.nextInt();
			}
			if((year % 4 == 0) && (year % 100 !=0)||(year % 400 == 0))
			{
				System.out.println(year +" is a Leap Year");
			}
			else
			{
				System.out.println(year +" is a Normal Year");
			}


		}
	
}
