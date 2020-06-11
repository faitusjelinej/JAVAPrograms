interface Waterbottleinterface{
	
	String color = "Blue";
	void fillUp();
	void pourOut();
	
}



public class InterfaceExample implements Waterbottleinterface 
{

	public static void main(String[] args) 
	{
		System.out.println(color);
		
		InterfaceExample ex = new InterfaceExample();
		ex.fillUp();
		ex.pourOut();

	}

	public void fillUp() {
		System.out.println("It is filled");
		
	}


	public void pourOut() 
	{
		System.out.println("It is out");
		
	}

}
