class AAA {
	void showAAA() {
		System.out.println("AAA class Method");
	}
}

class BBB extends AAA {
	void showBBB() {
		System.out.println("BBB class Method");
	}
}

public class CC extends AAA {
	void showCC() {
		System.out.println("CC class Method");
	}

	public static void main(String args[]) {
		AAA obj1 = new AAA();
		obj1.showAAA();
//		obj1.showBBB();
//		obj1.showCC();
		System.out.println("---------------------");

		BBB obj2 = new BBB();
		obj2.showAAA();
		obj2.showBBB();
//		obj2.showCC();
		System.out.println("---------------------");

		CC obj3 = new CC();
		obj3.showAAA();
//		obj3.showBBB();
		obj3.showCC();
	}
}
