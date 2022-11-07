package addition;

import java.util.Scanner;
public class multiplication {

	public static void main(String[] args) {
	int n,i,total=1;
	int a[]=new int[5];
	Scanner myobj=new Scanner(System.in);
	System.out.println("Enter how many numbers");
	n=myobj.nextInt();
	System.out.println("Enter "+ n + " numbers");
	for(i=0;i<n;i++)
	{
		a[i]=myobj.nextInt();
	}
	for(i=0;i<n;i++)
	{
total=total*a[i];

	}
	System.out.println("total multiplied answer="+ total);
}
}
