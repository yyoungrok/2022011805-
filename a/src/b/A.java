package b;

class Student{
	String name="Slim Shady";
	int studentid =0;
	boolean isMale;
	
	void printName(){
		System.out.println(name);
		System.out.println(studentid);
	}
	Student(String myname, int myid){
		name = myname;
		studentid = myid;
	}
	void sayHi() {
		System.out.println("hi my name is "+name);
	}
}
public class A {
	public static void main(String[]args) {
		Student shiloh = new Student(null, 0);
		shiloh.name = "shiloh holie-pitt";
		shiloh.sayHi();
		shiloh.isMale = true;
	}
}
