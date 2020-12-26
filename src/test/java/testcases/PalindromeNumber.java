package testcases;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");
		
		int num = sc.nextInt();
		int org_num=num;
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder rev = sbl.reverse();
		System.out.println("reverse number is:" + rev);
		
	}

}
