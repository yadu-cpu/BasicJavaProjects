package StringOperationas;

public class StringBasics {
public static void main(String args[])
{
	String str="Customer Relationship Management";
	String a[]=str.split(" ");
	int i=0;
	while(i<a.length)
	{
		System.out.println(" " + a[i]); 
		i++;
	}
}
}
