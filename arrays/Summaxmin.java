package arrays;

import java.util.Scanner;

public class Summaxmin {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		int sum=0;
		for(int a:arr) {
			if(a<min) min=a;
			
			if(a>max) max=a;
			sum+=a;
		}
		System.out.println(min+" "+max+" "+sum);
		sc.close();
	}

}
