public class Operators 
{
    public static void main(String[] args) 
    { 
        int a = 10;
        int b = 20;
        int c = 30;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (b - a));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (b / a));    // Quotient
        System.out.println("Modulus: " + (b % a));     // Remainder

        // Relational Operators
        System.out.println("Is a equal to b? " + (a == b));
        // boolean result = a == b;
        // System.out.println(result);
        System.out.println("Is a not equal to b? " + (a != b));
        System.out.println("Is a greater than b? " + (a > b));
        System.out.println("Is a less than b? " + (a < b));
        System.out.println("Is a greater than or equal to b? " + (a >= b));
        System.out.println("Is a less than or equal to b? "+ (a<= b));

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("Logical AND: " + (x && y));
        System.out.println("Logical OR: " + (x || y));
        System.out.println("Logical NOT: " + (!x));
        System.out.println(c>a && a<b); // true && true = true
        System.out.println(c>a || a<b); // true || true = true
        System.out.println(!y); // true

        // Assignment Operators
        int d = 5;
        d += 10; // d = d + 10                     
        System.out.println("Assignment (+=): " + d);
        d -= 5; // d = d - 5
        System.out.println("Assignment (-=): " + d);
        d *= 2; // d = d * 2
        System.out.println("Assignment (*=): " + d);
        d /= 2; // d = d / 2
        System.out.println("Assignment (/=): " + d);
        d %= 2; // d = d % 2
        System.out.println("Assignment (%=): " + d);
        d++; // d = d + 1   fetch the value of d and then increment it by 1
        System.out.println("Increment (d++): " + d);   // Post-Increment (d++) : 11
        d--; // d = d - 1
        System.out.println("Decrement (d--): " + d);   // Post-Decrement (d--) : 10
        ++d; // d = d + 1   first increment the value of d by 1 and then fetch it
        System.out.println("Pre-Increment (++d): " + d);   // Pre-Increment (++d) : 11
        --d; // d = d - 1   
        System.out.println("Pre-Decrement (--d): " + d);   // Pre-Decrement (--d) : 10
    }
}


