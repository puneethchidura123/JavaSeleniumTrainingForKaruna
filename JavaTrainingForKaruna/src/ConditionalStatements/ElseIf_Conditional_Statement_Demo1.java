package ConditionalStatements;

public class ElseIf_Conditional_Statement_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 47;
		
		if(age > 18 && age <60)
		{
			System.out.println("yes , u r eligible for voting");
		}
		else if (age > 18 && age >60)
		{
			System.out.println("yes , u r eligible for voting and we thank you for your vote");
		}
		else
		{
			System.out.println("sorry , u r not eligible for voting");
		}
		
	}

}
