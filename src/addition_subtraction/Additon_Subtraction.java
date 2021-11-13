package addition_subtraction;

import java.util.Scanner;

public class Additon_Subtraction {

	public static void main(String[] args) {
      // Addition
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int a =scan.nextInt();
		
	    System.out.println("Enter a another number");
		int b =scan.nextInt();
		
		System.out.println(a + b);
		
//	Subtraction
		
		System.out.println("Enter a number");
		int x =scan.nextInt();
		
	    System.out.println("Enter a another number");
		int y =scan.nextInt();
		
		System.out.println(x - y);
	}
	

}
