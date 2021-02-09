public class Animal {
	public static void main(String args[]) {
		System.out.println("1");
		Animal buzo = new Animal();
		buzo.eat();
		buzo.run();
		Birds sp = new Birds();
		sp.fly();
	}

	public void eat() {
		System.out.println("I am Eating");
	}
	public void run() {
		System.out.println("I am Running");
	}
}
class Birds{
	void fly() {
		System.out.println("I am flying");
	}
}
