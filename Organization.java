package OrganizationalAbstract;


//Abstract class
abstract class Cognizant {
	String name = "Cognizant Tech Solutions";
	
	public void domain() {
		System.out.println("Cognizant has different domains!");
		
	}
	
	//Abstract method does not have body
	public abstract void finance()
	;
}


class BFS extends Cognizant {

	@Override
	//abstract method must be used in the subclass
	public void finance() {
		System.out.println(name);
		
	}
	
}

public class Organization {

	public static void main(String[] args) {
		BFS b = new BFS();
		b.domain();
		//System.out.println(b.name);
		b.finance();

	}

}
