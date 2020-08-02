package StringOperationas;

public class CharacterAtDemo {
public static void main(String args[])
{
	String str="Yadnesh Anant Bhopatkar";
	String a[]=str.split(" ");
	char b=' ';
	for(int i=0;i<a.length;i++)
	{
		b= a[i].charAt(0);
	}
	System.out.println(b);
		
}
}
