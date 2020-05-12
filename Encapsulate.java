/*Encapsulation:

The whole idea behind encapsulation is to hide the implementation details from users. If a data member is private it means it can only be accessed within the same class. No outside class can access private data member (variable) of other class.


How to implement encapsulation in java:
1) Make the instance variables private so that they cannot be accessed directly from outside the class. You can only set and get values of these variables through the methods of the class.
2) Have getter and setter methods in the class to set and get the values of the fields. */


// Java program to demonstrate encapsulation 
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