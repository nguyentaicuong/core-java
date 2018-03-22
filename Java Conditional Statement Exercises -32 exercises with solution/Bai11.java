package baitapjava_32;

import java.util.Scanner;

public class Bai11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, n, sum=0;
		   {
		   Scanner in = new Scanner(System.in);  
		        System.out.print("Input number: ");  
		         n = in.nextInt();
		}
		  System.out.println("The first n natural numbers are : "+n);
		  
		 for(i=1;i<=n;i++)
		   {
		     System.out.println(i);
		     sum+=i;
		   }
		System.out.println("The Sum of Natural Number upto "+n+ " terms : " +sum);

		

	}

}
