package baitapjava_32;

import java.util.Scanner;

public class Bai15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,sum=0;

		   System.out.print("Input number of terms is: ");
		{
		   Scanner in = new Scanner(System.in);
				    n = in.nextInt();
		  System.out.println ("\nThe odd numbers are :");
		   for(i=1;i<=n;i++)

		   {
		     System.out.println (2*i-1);
		     sum+=2*i-1;
		   }
		   System.out.println ("The Sum of odd Natural Number upto " +n+" terms is: " +sum);
		}

	}

}
