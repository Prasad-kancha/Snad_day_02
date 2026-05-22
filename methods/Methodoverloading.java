package methods;

import java.util.Scanner;

public class Methodoverloading {
 static int add(int a,int b) {
	 return a+b;
 }
 static int add(int a,int b,int c) {
	 return a+b+c;
 }
 static String add(String a,String b) {
	 return a+b;
 }
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//int a=sc.nextInt();
    //int b=sc.nextInt();
    //int c=sc.nextInt();
    
    String e=sc.next();
    String f=sc.next();
	//String d=sc.next(),e=sc.next();
	//System.out.println(add(a,b));
	//System.out.println(add(a,b,c));
	System.out.println(add(e,f));

	sc.close();
}
}
