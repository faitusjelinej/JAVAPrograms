 abstract class Shape  
{ 
    String color; 
      
    // these are abstract methods 
    abstract double area(); 
    public abstract String toString(); 
      
    // abstract class can have constructor 
    public Shape(String color) { 
        System.out.println("Shape constructor called"); 
        this.color = color; 
    } 
      
} 
class Circle extends Shape 
{ 
    double radius; 
      
    public Circle(String color,double radius) { 
  
        // calling Shape constructor 
        super(color); 
        System.out.println("Circle constructor called"); 
        this.radius = radius; 
    } 
  
    @Override
    double area() { 
        return Math.PI * Math.pow(radius, 2); 
    } 
  
    @Override
    public String toString() { 
        return "Circle color is " + super.color +  
                       " and area is : " + area(); 
    } 
      
} 
class Rectangle extends Shape{ 
  
    double length; 
    double width; 
      
    public Rectangle(String color,double length,double width) { 
        // calling Shape constructor 
        super(color); 
        System.out.println("Rectangle constructor called"); 
        this.length = length; 
        this.width = width; 
    } 
      
    @Override
    double area() { 
        return length*width; 
    } 
  
    @Override
    public String toString() { 
        return "Rectangle color is " + super.color +  " and area is : " + area(); 
    } 
  
} 

class Square extends Shape{ 
  
    double length; 
      
    public Square(String color,double length) 
	{ 
        // calling Shape constructor 
        super(color); 
        System.out.println("Square constructor called"); 
        this.length = length; 
    } 
      
    @Override
    double area() { 
        return length*length; 
    } 
  
    @Override
    public String toString() { 
        return "Square color is " + super.color +  " and area is : " + area(); 
    } 
  
} 


public class Abstraction 
{ 
    public static void main(String[] args) 
    { 
        Shape s1 = new Circle("Red", 2.2); 
        Shape s2 = new Rectangle("Yellow", 2, 4); 
        Shape s3 = new Square("Blue", 5); 
		
        System.out.println(s1.toString()); 
        System.out.println(s2.toString()); 
		System.out.println(s3.toString());
    } 
} 