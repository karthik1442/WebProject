package testcases;

import java.util.Arrays;

public class arraysareequal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a1[] = { 1, 2, 10, 4 };
		int a2[] = { 2, 3, 4, 5 };

		boolean status = Arrays.equals(a1, a2);
		if (status = true) {
			System.out.print("arrays are equal");
		} else {
			System.out.println("arrays are not equal");
		}

	}

}
