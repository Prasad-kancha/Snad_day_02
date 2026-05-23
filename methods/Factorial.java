package methods;
import java.util.*;

public class Factorial {
 static int fact(int n){
	 if(n==0) {
		 return 1;
	 }
	 
	 return n * fact(n-1);
 }
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.print("Give number :");
	int n=sc.nextInt();
	System.out.println("factorial of number is "+ fact(n));
	sc.close();
}
}
