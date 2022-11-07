package addition;
/*This code will gives
 * square root of a number
 */
import java.lang.Math;
import java.util.Scanner;
public class squareroot {

	public static void main(String[] args) {
	double x,y;
	System.out.println("Enter the number");
	Scanner newobject=new Scanner(System.in);
	x=newobject.nextDouble();
	y=Math.sqrt(x);
	System.out.println("The sqare root of "+ x+" is "+y);
	
	}

}
