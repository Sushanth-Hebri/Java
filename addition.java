package addition;

import java.util.Scanner;

public class addition {

	public static void main(String[] args) {
		int x,y,sum;
		Scanner myobj=new Scanner(System.in);
		System.out.println("Enter one number");
		x=myobj.nextInt();
		System.out.println("Enter another number");
		y=myobj.nextInt();
		sum=x+y;
	System.out.println("sum of "+ x+" and "+ y+ " is "+ sum);

	}

}
