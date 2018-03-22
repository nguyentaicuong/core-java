package baitapjava_32;

import java.util.Scanner;

public class Bai27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = in.nextInt();

        if (n > 0)
        {
            System.out.println("Number is positive");
        }
        else if (n < 0)
        {
            System.out.println("Number is negative");
        }
        else
        {
            System.out.println("Number is zero");
        }
    


	}

}
