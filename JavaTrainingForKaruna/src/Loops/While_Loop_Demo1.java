package Loops;

public class While_Loop_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x = 1;
		while(x<=100)
		{
			if(x == 55)
			{
				continue;
			}
			System.out.println(x);
			x++;
		}
		
	}

}
