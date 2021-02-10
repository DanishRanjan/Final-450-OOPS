class A {
	void showA() {
		System.out.println("A class Method");
	}
}

public class B extends A {
	void showB() {
		System.out.println("B class Method");
	}

public static void main(String args[]) {
	A obj1 = new A();
	obj1.showA();
	
	B obj2 = new B();
	obj2.showB();
}
}
