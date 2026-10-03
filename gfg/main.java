// Area/Formula on Google
// Basic Program in Java
// How to move in next line
// Printing Text and Numbers
// Variables (int)
// Modifying values of Variables
// Arithmetic Operations on int
// Arithmetic Operations on double 
// Example: Calculate area of Circle
// Homework: Calculate Volume of Sphere
// Variable Naming Rules
// 1. Variables can start from alphabet or _ or $
// 2. Special characters except _ and $ are not allowed
// 3. Blanks, Commas not allowed
// 4. Keywords not allowed
// //Comments /*Comments*/  control command slash
// Input in Java // square of a number
// Example: Take 2,3 numbers input and print their sum
// Example: Calculate Simple Interest
// Modulus Operator  (usually works on integers)
//     Properties of Modulus Operator
//     1) a%b = a (if a < b)
//     2) a % (-b) = a % b
//     3) (-a) % b = - (a% b)
// int/int int/double
// double/int double/double
// character CHAR char ch = 'A';
// ASCII VALUES a-b(97-122)  A-B(65-90)  0-9(48-57)  
// Typecasting
// BODMAS /,*,%  >  +, -  (Priority)
    // 4*2/3 = 8/3 = 2 .....Left to right in arithmetic operator
    // 4*2/3 = 4*0 = 0
// ++x, x++, --x, x--

//rename all same name together (select it and refactor)

// relational operators are used to compare two values and return a boolean value (true or false). The relational operators in Java are:
// 1. == (equal to)        a = b (a ke andr b ki value hai ya nahi)  a==b (true ya false)
// 2. != (not equal to)
// 3. < (less than)
// 4. > (greater than)
// 5. <= (less than or equal to)
// 6. >= (greater than or equal to)



import java.util.Scanner;
public class main 
{
    public static void main(String[] args) 
    {
        System.out.println("""
                           Hi 
                           Vanshika """);

        System.out.print( 1 + 8 );
        System.out.println( " 1 + 8" );

        // Variables  (to store the particular data in different structures)

        int x = 5;  // declare ek hi br hota hai initialize br-br krr skte hain
        System.out.println( x );
        System.out.println( x + 7 );

        int y;
        y = 20;
        System.out.println(y);

        // Arithmetic Operations (+ , - , * , /)
        // Data types (int , float , double , char , )

        double c = 7;
        double area = 3.141592 * c * c;
        System.out.println(area);


        Scanner sc = new Scanner(System.in);  // input lene ke liye Scanner class ka object bnaya
        System.out.println("Enter radius : ");
        double r = sc.nextDouble();
        double sphere = (4/3) * 3.14 * r*r*r;
        System.out.println("Area is : " + sphere);
        
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter num 1 : ");
        int x1 = sc2.nextInt();
        System.out.println("Enter num 2 : ");
        int x2 = sc2.nextInt();
        System.out.println("Enter num 3 : ");
        int x3 = sc2.nextInt();
        System.out.println("Sum is : " + (x1 + x2 + x3));
        
        // Variables can start from alphabet or _ or $
        
        System.out.println(5%37);   // 5
        System.out.println(37%5);   // 2

        double id = 5/2;
        System.out.println(id);
        id = 5.0/2;   // 5.0/2.0    5/2.0
        System.out.println(id);

        char ch = 'A';
        System.out.println(ch);
        char eva = '+';
        System.out.println(eva);

        // Typecasting - ek data type se dusre datatype me conversion
        char cas = 'A';    //output 65
        int cast = cas; // implicit typecasting
        System.out.println(cast);

        char casti = 'a';  //output 97
        int castin = (int)casti;  // explicit typecasting
        System.out.println(castin);
        System.out.println(casti + casti);

        char num = '3';   // output 51
        System.out.println((int)num);

        // integer to character
        int p = 43;   // +    for space 32
        char q = (char)p;
        System.out.println(q);
    }
}
