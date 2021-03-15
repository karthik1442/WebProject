package testcases;

public class swappingnumbers {

	public static void main(String[] args) {
		
		int a = 10, b = 20;

		System.out.println("before swapping the avlues are .." + a + " " + b);

		int t = a;
		a = b;
		b = t;

		System.out.println("after swapping the values are .." + a + " " + b);

//logic2
		a = a + b;
		b = a - b;
		a = a - b;
		
		
		

		
		
	}

}
