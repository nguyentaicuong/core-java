package baitapjava_32;

import java.util.Scanner;

public class Bai32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
			 Scanner input = new Scanner(System.in); 
			 System.out.print("Input first floating­point number: "); 
			 double num1 = input.nextDouble(); 
			 System.out.print("Input second floating­point number: "); 
			 double num2 = input.nextDouble(); 
			 input.close(); 
			  
			 if (Math.abs(num1 - num2) <= 0.01) { 
			     System.out.println("These numbers are the same."); 
			 } 
			 else { 
			     System.out.println("These numbers are different."); 
			 } 

	}

}
