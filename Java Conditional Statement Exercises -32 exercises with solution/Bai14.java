package baitapjava_32;

import java.util.Scanner;

public class Bai14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j,n;

		   System.out.print("Input the number(Table to be calculated): ");
		{
		   System.out.print("Input number of terms : ");
		    Scanner in = new Scanner(System.in);
				    n = in.nextInt();

		   System.out.println ("\n");
		   for(j=0;j<=n;j++)
		  
		     System.out.println(n+" X "+j+" = " +n*j);
		   }

	}

}
