package Abstraction;

abstract class A {
	abstract void men1();
	abstract void men2();

}
class B extends A{
	void men1(){
		System.out.println("Muthu");
	}
	void men2(){
		System.out.println("Mari");
	}
	
}
class MMaaiinn{
	public static void main(String args[]) {
		B ref=new B();
		ref.men1();
		ref.men2();
	}
}
 /* Abstraction means showing only important features and hiding internal details.
  *  It is achieved using abstract classes and interfaces in Java.
  * It helps reduce complexity and improves code security and flexibility. */