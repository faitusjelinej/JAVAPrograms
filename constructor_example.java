/*We create a constructor to initialize an object. They have the same name as the class but have no explicit return type. It can be used to set initial values for object attributes. It is similar to a Java method*/

class constructor_example
{
 String name, course, technology;
 
// defining the constructor
constructor_example(String s,String n)
	{
		name = s ;
		course = n ;
	}

// defining the constructor
 constructor_example(String s,String n,String c)
	{
		name = s;
		course = n;
		technology = c;
	}

void show( ) 
	{ 
	System.out.println(name +""+course+""+technology); 
	}
 
	public static void main(String args[ ])
	{
 		constructor_example ob1 = new constructor_example("MS","CS"); //using the constructor to initialize values
 		constructor_example ob2 = new constructor_example("MS","DS","IT"); //using the constructor to initialize values
 		ob1.show( );
 		ob2.show( );
        }
}
