import java.util.*;

public class Animal1 {
	
//	two ways how to initialize object
 //-----------------------------------------BY using Method--------------By using Method---------------------------------------
	
	String color;   //instance variable
	int age;
	void initObject (String s, int a) {
		color = s;            
		age = a;
	}
	void display() {
		System.out.println(color+" "+age); 
	}
	
	public static void main(String args[]) {
		Animal1 buzo = new Animal1();
		buzo.initObject("Black", 10);
		buzo.display();
	}
	
	
//----------------------------------by using Reference variable--------------------------------------------------------------	
//	String color;
//	int age;
//	public static void main(String args[]) {
//		Animal1 buzo = new Animal1();
//		buzo.color = "Black";
//		buzo.age = 10;
//		System.out.println(buzo.color+" "+buzo.age);
//	}
	
//-----------------------------------By using Constructor------------------By using Constructor-------------------------------
	
	
//	1.    constructor is a block (similar to method) having. same name as that of class name
//	2.    constructor does not have any return type NOT EVEN VOID
//	3.    The only modifiers applicable for constructor are public protected default and private
//	4.    Its execute automatically when we create an object

//	String employee;
//	int emp_id;

	
	
	
	
	
}
