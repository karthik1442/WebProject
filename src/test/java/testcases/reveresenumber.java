package testcases;

import java.util.Scanner;

public class reveresenumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number:");

		int num = sc.nextInt();

		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder rev = sbl.reverse();
		System.out.println("reverse number is:" + rev);
    
		
		

	}

}
