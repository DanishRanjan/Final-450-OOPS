//INHERITANCE
//main advantages of inheritance is code reusability
//we can use achieve polymorphism using inheritance
//disadvantage is : both class tightly coupled
//Types of Inheritance in java
//1. Single Inheritance.
//2. Multilevel Inheritance.
//3. Hierarchical Inheritance.
//4. Multiple Inheritance. (not applicable in java)
//5. Hybrid Inheritance (also known as Virtual Inheritance) (not applicable in java)



public class Bird extends Sparrow {	
	public static void main(String args[]) {
		Sparrow sp = new Sparrow();
		sp.eat();
	}
}

class Sparrow  {
	void eat() {
		System.out.println("i am eating");
	}
}	