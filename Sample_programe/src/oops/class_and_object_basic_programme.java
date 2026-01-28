package oops;

public class class_and_object_basic_programme {
	String name;
	int age;
	
	void dummymethod() {
		System.out.println(name);
		System.out.println(age);
	}
	
	public static void main(String args[]) {
		class_and_object_basic_programme ref=new class_and_object_basic_programme();
		ref.name="muthu";
		ref.age=87;
		ref.dummymethod();
		class_and_object_basic_programme ref1=new class_and_object_basic_programme();
		ref1.name="ranjith";
		ref1.age=45;
		ref1.dummymethod();
	}

}
/*     Notes:  * provide the data but hiding the implementation
 *               user public getters and setters
 *               improve security and maintanabality
 */
