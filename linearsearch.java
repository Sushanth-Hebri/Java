package addition;

import java.util.Scanner;
public class linearsearch {

	public static void main(String[] args) {
		int ele,i,loc=-1,n;
		int a[]=new int[10];
		System.out.println("Enter the size of array");
		Scanner myobj=new Scanner(System.in);
		n=myobj.nextInt();
		System.out.println("Enter "+n +" elements\n");
		for(i=0;i<n;i++)
		{
			a[i]=myobj.nextInt();
		
		}
		System.out.println("Enter the element to be searched\n");
		ele=myobj.nextInt();
		for(i=0;i<n;i++)
		{
			if(ele==a[i])
			{
				loc=i;
				System.out.println("Element "+ ele+ " found in location "+ loc);
			}
				
		}
		if(loc==-1)
			{System.out.println("Element not found");}
			
		}
		
	}



