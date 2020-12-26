package testcases;

import java.util.ArrayList;

import javax.print.DocFlavor.STRING;

public class arraylist {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		System.out.println(list);
		list.add("karthik");
		list.add("kutala");
		System.out.println(list);
		System.out.println(list.size());
		list.remove(0);
		list.remove(2);
		System.out.println(list);
	}

}
