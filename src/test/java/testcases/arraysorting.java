package testcases;

import java.util.Arrays;
import java.util.Collections;

public class arraysorting {

	public static void main(String[] args) {

		int a[] = { 20, 70, 40, 50 };

		System.out.println("array sorting before;" + Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("array sorting AFTER;" + Arrays.toString(a));

		// logic

		int b[] = { 20, 70, 40, 50 };
		System.out.println("array sorting before;" + Arrays.toString(b));
		Arrays.sort(b);
		System.out.println("array sorting AFTER;" + Arrays.toString(b));

		// LOGIC3

		Integer c[] = { 20, 70, 40, 50 };
		System.out.println("array sorting before;" + Arrays.toString(c));
		Arrays.sort(c, Collections.reverseOrder());
		System.out.println("array sorting AFTER;" + Arrays.toString(c));

	}

}
