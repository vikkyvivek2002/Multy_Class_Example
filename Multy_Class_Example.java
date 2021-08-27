class Outer_class
{
	int num;
	private class Inner_class
	{
		public void show() {
			System.out.println("Inner class ");
		}
	}
	void Display ()
	{
		Inner_class obj = new Inner_class();
		obj.show();
	}
}
public class Multy_Class_Example {

	public static void main(String[] args) {
		
		Outer_class obj2 = new Outer_class();
		obj2.Display();

	}

}
