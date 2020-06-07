public class Encapsulate 
{ 
    // private variables declared  
    // these can only be accessed by  
    // public methods of class 
    private String employeeName; 
    private int employeeRoll; 
    private int employeeAge; 
  
    // get method for age to access  
    // private variable employeeAge 
    public int getAge()  
    { 
      return employeeAge; 
    } 
   
    // get method for name to access  
    // private variable employeeName 
    public String getName()  
    { 
      return employeeName; 
    } 
      
    // get method for roll to access  
    // private variable employeeRoll 
    public int getRoll()  
    { 
       return employeeRoll; 
    } 
   
    // set method for age to access  
    // private variable employeeage 
    public void setAge( int newAge) 
    { 
      employeeAge = newAge; 
    } 
   
    // set method for name to access  
    // private variable employeeName 
    public void setName(String newName) 
    { 
      employeeName = newName; 
    } 
      
    // set method for roll to access  
    // private variable employeeRoll 
    public void setRoll( int newRoll)  
    { 
      employeeRoll = newRoll; 
    } 
}


public class TestEncapsulation 
{     
    public static void main (String[] args)  
    { 
        Encapsulate obj = new Encapsulate(); 
          
        // setting values of the variables  
        obj.setName("Jeline"); 
        obj.setAge(36); 
        obj.setRoll(1001); 
          
        // Displaying values of the variables 
        System.out.println("employee's name: " + obj.getName()); 
        System.out.println("employee's age: " + obj.getAge()); 
        System.out.println("employee's roll: " + obj.getRoll()); 
          
        
    } 
}