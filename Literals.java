public class Literals 
{
    public static void main(String args[])
    {
        int num1 = 0b101;  // binary literal(work with base 2)
        System.out.println(num1);

        int num2 = 0x7E;   // hexadecimal literal
        System.out.println(num2);

        int num3 = 10_00_00_000; // underscore in numeric literal for better readability
        System.out.println(num3);

        double num4 = 56;    // integer literal assigned to double variable
        System.out.println(num4);

        double num5 = 12e10; // scientific notation
        System.out.println(num5);

        char c = 'a'; // character literal  
        System.out.println(c);
        c++;
        System.out.println(c);
        
    }
}



