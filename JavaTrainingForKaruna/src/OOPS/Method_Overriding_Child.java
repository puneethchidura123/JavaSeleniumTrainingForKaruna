package OOPS;

public class Method_Overriding_Child extends Method_Overriding_Parent {

	
	public void work()
	{
		System.out.println(" i will play");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Method_Overriding_Child moc = new Method_Overriding_Child();
		moc.work();
		Method_Overriding_Parent mop = new Method_Overriding_Parent();
		mop.work();
	}

}
