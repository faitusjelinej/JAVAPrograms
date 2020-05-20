//A static variable is common to all the instances (or objects) of the class because it is a class level variable. In other words you can say that only a single copy of static variable is created and shared among all the instances of the class. Memory allocation for such variables only happens once when the class is loaded in the memory.

//Static variable is useful when we need to do memory management.

//Java Program to demonstrate the use of static variable  
 
class Counter_staticvariable
{  
	static int count=0;//will get memory each time when the instance is created  
  
	Counter_staticvariable()
	{  
	count++;//incrementing value  
	System.out.println(count);  
	}  
  
	public static void main(String args[])
	{  
		//Creating objects  
		Counter_staticvariable c1=new Counter_staticvariable();  
		Counter_staticvariable c2=new Counter_staticvariable();  
		Counter_staticvariable c3=new Counter_staticvariable();  
	}  
}  