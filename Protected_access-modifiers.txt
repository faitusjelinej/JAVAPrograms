/* 
What are access modifiers in Java?

In Java, access modifiers are special keywords which are used to restrict the access of a class, constructor, data member and method in another class. Java supports four types of access modifiers:

Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.

Default: The access level of a default modifier is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.

Protected: The access level of a protected modifier is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.

Public: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.
*/


package abcpackage;
public class Addition 
{

   protected int addTwoNumbers(int a, int b)
	{
	return a+b;
        }
}

package xyzpackage;
import abcpackage.*;
class Protectedexample extends Addition{
   public static void main(String args[]){
	Protectedexample obj = new Protectedexample();
	System.out.println(obj.addTwoNumbers(11, 22));
   }
}