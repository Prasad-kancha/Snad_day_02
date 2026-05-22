package methods;

import java.util.Scanner;

public class Addtwonums {
	
	static void addTwonums(int a,int b) {
		System.out.println("sum of two numbers are "+(a+b));
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt();
		addTwonums(a,b);
		sc.close();
		
	}

}
