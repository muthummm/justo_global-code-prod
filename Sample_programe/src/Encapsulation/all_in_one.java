package Encapsulation;

public class all_in_one {
	private String name;
	private int age;
	
	// setter 
	void Set_values(String df, int ii) {
		name=df;
		age=ii;
	}
	void show() {
		System.out.println(name);
		System.out.println(age);
	}
	// getter 
	 String getters_name() {
		return name;
	}
	 int getters_age() {
		 return age;
	 }
		

}

class Main{

public static void main(String args[]) {
	all_in_one ref=new all_in_one();
	//setter
	ref.Set_values("Muthu", 45);
	//getter
	System.out.println(ref.getters_name());
	System.out.println(ref.getters_age());
	
}
}
/*    
Providing the data and hiding the implementation
Use private for fields
Use public getters & setters
*/
