package DataTypes.TypeCasting;

public class Narrowing_And_Widening {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// widening
		
		byte b = 10;

		int i = b; 
		
		System.out.println(i);
		
		//narrowing
		
		int i1 = 24;

		byte b1 = (byte)i1;
		
		System.out.println(b1);

	}

}
