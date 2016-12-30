import java.util.Scanner;

public class Class {

public static void main(String[]args)
{
	int a,b;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the value1 : ");
	a = sc.nextInt();
	System.out.println("enter the value2 : ");
	b = sc.nextInt();
	int f = (a*a) + (2*a*b) + (b*b);
	System.out.println("Output : "+f);
	
	/*a=b*b;
	c=d*d;
	e=a+c;
	f=2*b*d+e;*/
	
}
}