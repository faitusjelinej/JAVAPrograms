public class Implicit_Explicit_casting {
    public static void main(String[] args)
	{
		 // Casting byte to int type
        byte a = 100;
        int b = a;
        System.out.println("value of a: "+a);
        System.out.println("value of b: "+b);
        // Casting int to long type
        long c = b;
        System.out.println("value of c: "+c);
        // Casting long to float type
        float d = c;
        System.out.println("value of d: "+d);
		
		
        // Casting float to long type
        float e = 100.25f;
        long f = (long)e; // It truncates result
        System.out.println("value of a: "+e);
        System.out.println("value of b:"+f);
        // Casting long to int type
        int g = (int)f;
        System.out.println("value of c:"+g);
        // Casting int to byte type
        byte h = (byte)g;
        System.out.println("value of d:"+h);	
    } 
}