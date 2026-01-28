package oops;

public class Methods {
	/*-------------    -----------------Void non parameterised-----------------------------*/
	/*
	public static void main(String args[]) {
		addition();		
	}
	public static void addition() {
		int a=5;
		int b=10;
		int c=a+b;
		System.out.println(c);
	}
	*/
	/*-------------------------------------Void with parameterised----------------------------*/
	/*
	public static void main(String args[]) {
		addition(5,10);		
	}
	public static void addition(int a,int b) {	
		int c=a+b;
		System.out.println(c);
	}
	*/
	/*-----------------------------Void function with parameters with return type-------------------*/
	/*
	public static void main(String args[]) {
		// Note: we should store in main method which is returning from method
		int returnc=addition(5,10);	
		System.out.println(returnc);
	}
	public static int addition(int a,int b) {	
		int c=a+b;
		return c;
	}
	*/
	/*------------------------------Recurssion method calling itself--------------------------------*/
	void mem() {
		System.out.println("Muthu");
		mem();
	}
	public static void main(String args[]) {
		Methods ref1=new Methods();
		ref1.mem();
		
	}
	

}
