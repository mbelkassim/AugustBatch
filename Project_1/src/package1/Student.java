package package1;

public class Student {

	
    int age;
    int rollNo;
public void display1() {
	
	System.out.println("Welcome to all of you");
}
public void display2() {
	System.out.println("Automation is very hard");
}


public static void main(String[] args) {
		// TODO Auto-generated method stub

// ClassName refeVarName = new className();
Student ob = new Student();
//Calling statement to call a method 
ob.age=17;
ob.rollNo=8;

ob.display1();
ob.display2();
System.out.println("The age is:"+ob.age);
System.out.println("RollNo is:"+ob.rollNo);



}
}