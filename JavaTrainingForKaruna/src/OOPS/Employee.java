package OOPS;

public class Employee {

	
	// attributes OR Variables
	
	
	static String company_name = "TCS",company_address="hyderabad";  // static variables
	
	// instance variables
	String name,designation,department,personal_addres;
	int id,age;
	
	
	// methods / actions
	
	
	
	static void login()
	{
		System.out.println("login in progress");
	}
	
	static void logout()
	{
		System.out.println("logout in progress");
	}
	
	void writeCode()
	{
		System.out.println("coding in progress");
	}
	
	void doTesting()
	{
		System.out.println("testing in progress");
	}
	
	public static void takeABreak()
	{
		System.out.println("i am on break");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee Ram = new Employee();
		Employee Rahim = new Employee();
		Employee Robert = new Employee();
		
		
		
		Ram.name = "Ram P";
		Ram.designation = "Software Developer";
		Ram.department = "Development";
		Ram.personal_addres = "chennai";
		Ram.id= 245;
		Ram.age=29;
		
		
		
		Rahim.name = "Rahim R";
		Rahim.designation = "Software Tester";
		Rahim.department = "Testing";
		Rahim.personal_addres = "bengaluru";
		Rahim.id= 246;
		Rahim.age=28;
		
		//accessing static variables
		System.out.println(Ram.company_address);
		
		
		//accessing instance variables
		System.out.println(Rahim.designation);
		
		
		//accessing static methods
		Employee.login();
		Employee.logout();
		Employee.takeABreak();
		
		
		//accessing instance methods
		Ram.writeCode();
		Rahim.doTesting();
		
	}

}
