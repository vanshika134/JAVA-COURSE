public class Casting 
{
    public static void main(String[] args) 
    {
        byte b = 127;
        int a = b;
        // byte b = 257;  257 is out of range for byte, so it will cause a compilation error
        System.out.println("Byte value(b): " + b);
        System.out.println("Int value(a): " + a);

        int x = 12;
        byte y = (byte) x; // Explicit casting from int to byte
        //byte y = x; This will cause a compilation error because int cannot be directly assigned to byte without casting
        System.out.println("Int value(x): " + x);
        System.out.println("Byte value(y): " + y);

        int num = 257;
        byte b1 = (byte) num; // Explicit casting from int to byte
        System.out.println("Int value(num): " + num);
        System.out.println("Byte value(b1): " + b1);

        float f = 5.6f;
        int i = (int) f; // Explicit casting from float to int
        System.out.println("Float value(f): " + f);    
        System.out.println("Int value(i): " + i);

    }      
}

