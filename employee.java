//	1.    constructor is a block (similar to method) having. same name as that of class name
//	2.    constructor does not have any return type NOT EVEN VOID
//	3.    The only modifiers applicable for constructor are public protected default and private
//	4.    Its execute automatically when we create an object
//  5.    Its is use to initialize an object
//  6.	  Constructor never creates an object, its NEW keyword which is responsible for creating  new object  
//  7.    There are three types of constructor 
//          a) default constructor , it is a no argument constructor
//			in this compiler is responsible for creating constructor not JVM
//          b) NO argument constructor, it is user defined  
//          c) Parameterized constructor 
 

//        constructor is only used to initialize an object (not to create object) , thats why it has no return type

public class employee {
	String name;
	int emp_id;

	employee(String name, int emp_id) {
		this.name = name;
		this.emp_id = emp_id;
	}

	public static void main(String args[]) {
		employee e1 = new employee("Danish", 101);
		employee e2 = new employee("Sourabh", 102);
		System.out.println("Employee 1: "+e1.name+" "+e1.emp_id);
		System.out.println("Employee 2: "+e2.name+" "+e2.emp_id);
	}
}
