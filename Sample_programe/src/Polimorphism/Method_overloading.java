package Polimorphism;

public class Method_overloading {
	void onemethod(int e) {
		System.out.println("method 1");
	}
	void onemethod(int c, String t) {
		System.out.println("method 2");
	}
	void onemethod(int d, int o, String j) {
		System.out.println("method 3");
	}

}
class Main{
	public static void main(String args[]) {
		Method_overloading ref=new Method_overloading();
		ref.onemethod(5,5, "krf");
	}
}
