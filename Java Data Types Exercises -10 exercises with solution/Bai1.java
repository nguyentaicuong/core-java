package baitapjava10;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner input = new Scanner(System.in);

        System.out.print("Nh?p vào d? F: ");
        double dof = input.nextDouble();

        double  doc =(( 5 *(dof - 32.0)) / 1.8);
        System.out.println(dof + " do F bang " + doc + " do C");
    

	}

}
