package methods;

import java.util.*;
public class Methodcreate {
	static void methodcreated(String name){
		System.out.println("hello "+name);
	}
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  String name=sc.next();
	  
	methodcreated(name);
	sc.close();
}
}
