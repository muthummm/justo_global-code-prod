package Polimorphism;

class Method_overwriding_A {
	void dummy1() {
		System.out.println("don");
	}

}
class Method_overwriding_B extends Method_overwriding_A{
	void dummy1() {
		System.out.println("boss");
	}
}
class MMain{
	public static void main(String args[]) {
		Method_overwriding_A ref=new Method_overwriding_B();
		ref.dummy1();
	}
}

/* One thing many form
 * same method but differnt form
 * Over loading ( perameter type )
 * Over riding ( Object type )
 * upcasting is covered  
*/
