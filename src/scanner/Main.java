package scanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String name;
		int age;
		
		Scanner hp = new Scanner(System.in);{
			System.out.println("what is your name");
			name = hp.next();
			System.out.println("Hello, " + name);
			System.out.println("what is your age?");
			age = hp.nextInt();
			System.out.println(" age is " + age);
			
			
		}
		
		
	

	}

}
