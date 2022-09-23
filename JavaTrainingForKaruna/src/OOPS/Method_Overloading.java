package OOPS;

public class Method_Overloading {

	public void sum(int a, int b)
	{
		System.out.println("2 integer agrumnets");
	}
	
	
	public void sum(String a, String b)
	{
		System.out.println("2 String agrumnets");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method_Overloading mo = new Method_Overloading();
		mo.sum("1", "2");

	}

}
