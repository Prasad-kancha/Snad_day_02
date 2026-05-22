package methods;

import java.util.Scanner;

public class Square {
	static int square(int n) {
		return n*n;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res= square(n);
		System.out.println("Square of the number is "+res);
		sc.close();
	}

}
