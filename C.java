class AA {
	void showAA() {
		System.out.println("AA class Method");
	}
}

class BB extends AA {
	void showBB() {
		System.out.println("BB class Method");
	}
}

public class C extends BB {
	void showC() {
		System.out.println("C class Method");
	}

	public static void main(String args[]) {
		AA obj1 = new AA();
		obj1.showAA();
//		obj1.showBB();
//		obj1.showC();
		System.out.println("---------------------");

		BB obj2 = new BB();
		obj2.showAA();
		obj2.showBB();
//		obj2.showC();
		System.out.println("---------------------");

		C obj3 = new C();
		obj3.showAA();
		obj3.showBB();
		obj3.showC();
	}
}
