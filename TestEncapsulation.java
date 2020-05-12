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