package scanner;

import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		String name;
		int age;
		double price;
		
		Scanner mytest = new Scanner(System.in);
		System.out.println("pease enter your name");
		name = mytest.nextLine();
		System.out.println("your name is " + name);
		
		System.out.println("please enter your age");
		age = mytest.nextInt();
		System.out.println("your age is " + age);
		
		System.out.println("please enter your mobile price");
		price = mytest.nextDouble();
		System.out.println("your mobile price is " + price );
		

	}

}
