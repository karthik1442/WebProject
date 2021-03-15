package testcases;

import java.util.Scanner;

public class reveresenumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number:");

		int num = sc.nextInt();

		//logic 1 
		
		/*StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder rev = sbl.reverse();
		System.out.println("reverse number is:" + rev);*/
		
		//logic 2 
		
		StringBuffer sb =new StringBuffer(String.valueOf(num));
		
		StringBuffer rev =sb.reverse();
		
		
		System.out.println(" reverse number:"+rev);
		

	}

}
