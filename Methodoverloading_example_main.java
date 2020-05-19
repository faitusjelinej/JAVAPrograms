//Method Overloading is a feature that allows a class to have more than one method having the same name, if their argument lists are different. 

class Methodoverloading_example
{
    public void disp(char c)
    {
         System.out.println(c);
    }
    public void disp(char c, int num)  
    {
         System.out.println(c + " "+num);
    }
}
class Methodoverloading_example_main
{
   public static void main(String args[])
   {
       Methodoverloading_example obj = new Methodoverloading_example();
       obj.disp('a');
       obj.disp('a',10);
   }
}