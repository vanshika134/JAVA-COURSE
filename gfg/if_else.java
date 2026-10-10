// If-Else Statements
// Ques: Take positive integer input and tell if it is odd or even
// HW: Take positive integer input and tell if it is divisible by 5 or not.
// Ques: Take integer input and print the absolute value of that integer
// Ques: Take real number input and check if it is an integer or not.
// Ques: If cost price and selling price of an item is input through the keyboard, write a program to determine whether the seller has made profit or incurred loss or no profit no loss. Also determine how much profit he made or loss he incurred.
// Else If Ladder
    // if (cond2) --
    // else if (C2) --
    // else if ((3) --
    // else if ((4)--
    // else-
// HW: Take length and breadth of rectangle as input and write a program to find whether the area of rectangle is greater than its perimeter.
// Ques: Take positive integer input andprint:
    // Vanshika if number is divisible by 5
    // Aayushi if number is divisible by 3
    // VanshikaAayushi if number is divisible by 5 & 3 both
    // Neither if number is not divisible by 5 or 3
// HW: Given a point (x, y), write a program to find out if it lies in the 1st Quadrant, 2nd Quadrant, 3rd Quadrant, 4th Quadrant, on the x-axis, y-axis or at the origin.
// Multiple Conditions using && (logical and) and || (logical or)
// Ques: Take positive integer input and tell if it is a four digit number or not.
// HW: Take integer input and tell if its magnitude(ABSOLUTE VALUE|-34|) is smaller than 69 or not.
// Ques: Take positive integer input and tell if it is divisible by 5 or 3.
// Ques: Take 3 positive integers input and tell if they can be the sides of a triangle or not.(a+b>c, b+c>a, a+c>b)
// Ques: Take 3 positive integers input and print the greatest of them.
// HW: Take 3 positive integers input and print the least of them.
// Nested If-Else
    // if(){
    //     if(){
    //     }
    //     else{
    //     }
    // }
    // else{
    //     if(){
    //     }
    //     else{
    //     }
    // }

// Ques: Take 3 positive integers input and print the greatest of them.
// Ternary Operator (condition ? sach : jhoot;)
// Ques: Take positive integer input and tell if it is odd or even


import java.util.Scanner;
public class if_else 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your num1 : ");
        int num1 = sc.nextInt();
        if (num1 % 2 == 0)    System.out.println("Even");
        else                  System.out.println("Odd");
        System.out.println((num1 + " " + (num1 % 2 == 0 ? "Even" : "Odd")));

        System.out.println("Enter your num2 : ");
        int num2 = sc.nextInt();      // Absolute value of integer
        // if(num2 >= 0)        System.out.println(num2);
        // else                 System.out.println(-num2);
        if(num2 < 0) num2 = -num2;   
        System.out.println(num2);

        System.out.println("Enter your num3 : ");
        double num3 = sc.nextDouble();
        if(num3 == (int)num3)       System.out.println("Integer");
        else                        System.out.println("Not Integer");

        System.out.println("Enter your cp : ");
        int cp = sc.nextInt();
        System.out.println("Enter your sp : ");
        int sp = sc.nextInt();
        if(sp > cp)     System.out.println("Profit : " + (sp - cp) + " Profit Percentage : " + ((sp - cp) * 100 / cp) + "%");
        else 
            if(sp < cp) System.out.println("Loss : " + (cp - sp) + " Loss Percentage : " + ((cp - sp) * 100 / cp) + "%");
        else            System.out.println("No Profit No Loss" + " Profit Percentage : 0% Loss Percentage : 0%");
        
        // Ternary Operator (condition ? sach : jhoot;)

        System.out.println("Enter your num4 : ");   
        int num4 = sc.nextInt();    // Ternary Operator
        System.out.println((num4 % 5 == 0 && num4 % 3 == 0) ? "VanshikaAayushi" : (num4 % 5 == 0) ? "Vanshika" : (num4 % 3 == 0) ? "Aayushi" : "Neither");

        System.out.println("Enter your num5 : ");
        int num5 = sc.nextInt(); 
        if(num5 > 999 && num5 < 10000)   System.out.println("Four Digit Number");
        else                             System.out.println("Not Four Digit Number");

        System.out.println("Enter your a : ");
        int a = sc.nextInt();
        System.out.println("Enter your b : ");
        int b = sc.nextInt();
        System.out.println("Enter your c : ");
        int c = sc.nextInt();
        if(a+b > c && b+c > a && a+c > b)   System.out.println("Triangle is valid");
        else                                System.out.println("Triangle is not valid");

        System.out.println("Enter your length : ");
        int length = sc.nextInt();
        System.out.println("Enter your breadth : ");
        int breadth = sc.nextInt();
        if(length * breadth > 2 * (length + breadth))   System.out.println("Area is greater than perimeter");
        else                                            System.out.println("Area is not greater than perimeter");

        System.out.println("Enter x: ");
        int x = sc.nextInt();
        System.out.println("Enter y: ");
        int y = sc.nextInt();
        if(x > 0 && y > 0)  System.out.println("I Quadrant");
        else if(x < 0 && y > 0)  System.out.println("II Quadrant");
        else if(x < 0 && y < 0)  System.out.println("III Quadrant");
        else if(x > 0 && y < 0)  System.out.println("IV Quadrant");
        else if(x == 0 && y == 0) System.out.println("Origin");
        else if(x == 0)           System.out.println("Y-Axis");
        else                      System.out.println("X-Axis");

        System.out.println("Enter your num6 : ");
        int num6 = sc.nextInt();
        System.out.println("Enter your num7 : ");
        int num7 = sc.nextInt();
        System.out.println("Enter your num8 : ");
        int num8 = sc.nextInt();
        if(num6 > num7 && num6 > num8)       System.out.println("Greatest is : " + num6);
        else if(num7 > num6 && num7 > num8)  System.out.println("Greatest is : " + num7);
        else if(num8 > num6 && num8 > num7)  System.out.println("Greatest is : " + num8);
        else                                 System.out.println("All are equal" + num6);

        int n = sc.nextInt(); 
        System.out.println((n % 2 == 0) ? "Even" : "Odd");


    }

}


