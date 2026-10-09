import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
       for(int i = 1; i <= 10; i++)
       {
            System.out.print(i + " Vanshika" + "  ");
       }
       System.out.println();
       for(int i = -7; i <= 15; i++)
       {
        System.out.print("Hi " + i + "  ");
       }

    //    int i ;          SCOPE OF VARIABLE
    //    for(i = 1; i <= 10; i++)
    //    {
    //     System.out.print(i + " ");
    //    }
    //    System.out.print(i);

       System.out.println();
       System.out.print("Enter a string : ");
       String n = sc.nextLine();
       for(int i = 0; i < n.length(); i++)
       {
           System.out.print(n.charAt(i) + "-");
           System.out.print(n + " ");
       }
       System.out.println();
       
       for(int i = 2; i < 101; i = i+2)
        {
            System.out.print(i + " ");
        }
        System.out.println();

    //    for(int i = 17; i <= 170; i++)        154 iteration hai loop ke   and 171 pe break hoga
    //    {
    //     if(i%17 == 0) // sout(i+ " ");
    //    }
        // for(int i = 1 ; i <= 10; i++)
        // {
        //     System.out.print(i*17);
        // }

       for(int i = 17; i <= 170; i=i+17)  // 10 iterations hai loop ke and 187 pr break hoga 
       {
        System.out.print(i+ " ");
       }
       System.out.println();
       
       for(int i = 1; i <= 100; i=i+2)
        {
            if(i%3 == 0)    System.out.print(i+" ");
        }
        System.out.println();

        for(int i = 10; i >= 1; i--)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        
        int num = sc.nextInt();
        // 2,5,8,11,14,17,......
        for(int i = 2; i <= (3*num - 1); i+=3)  // a + (n-1)d
        {
            System.out.print(i + " ");
        }
        System.out.println();

        // 4,10,16,22,28
        int a = 4, d = 6;
        for(int i = 1; i <= num; i++)
            {
                System.out.print(a + " ");
                a+=d;
            }
        System.out.println();
        
        // 99,95,91,87,..........
        int b = 99, c = 4;
        for(int i = num; i >0 ;i--)
            {
                System.out.print(b + " ");
                b -= c;
            }
        System.out.println();
        
        // 1,2,4,8,.....  An = a*r^(n-1)
        int p = 1, r= 2;
        for(int i = 1; i<= num; i++)
        {
            System.out.print(a);
            p*= r;
        }
        System.out.println();

        for(int i = 1; i <= 10; i++)
        {
            System.out.print(i +" " +  num + "  ");
            num--;
        }
        System.out.println();

        for(int i = 65; i <= 90; i++)
        {
            System.out.print(" " + (char)i + " - " + i);
        }
        System.out.println();

        // BREAK(stop) AND CONTINUE(skip)    iterations
        System.out.println("Enter your numb: ");
        int numb = sc.nextInt();
        // for(int i = 2; i <= numb-1; i++)
        // {
        //     if(numb%i == 0)
        //     {
        //         System.out.print("Composite  ");
        //     }
        //     else
        //         System.out.print("Prime  ");
        // }

        boolean isPrime = true;
        for(int i = 2; i <= numb - 1; i++)    // for(int i = 2; i <= Math.sqrt(num); i++)     // for(int i = 2; i * i <= num; i++)
        {
            if(numb % i == 0)
            {
                isPrime = false;
                break;
            }
        }
        if(isPrime)
            System.out.println("Prime");
        else
            System.out.println("Composite");

        // int num = sc.nextInt();

        // if(num <= 1)
        // {
        //     System.out.println("Neither Prime nor Composite");
        // }
        // else
        // {
        //     boolean isPrime = true;

        //     for(int i = 2; i * i <= num; i++)
        //     {
        //         if(num % i == 0)
        //         {
        //             isPrime = false;
        //             break;
        //         }
        //     }

        //     if(isPrime)
        //         System.out.println("Prime");
        //     else
        //         System.out.println("Composite");
        // }

        // while generally used when conditions are more than one  (INITIALIZE CONDITION PRINT INCREMENT)

        int i = 1;
        while(i <= 10)
        {
            System.out.print(i + " ");
            i++;
        }

        int j = 11;
        do{
            System.out.print(i + " ");
            i++;
        }while(j <= 10);
    }
}


// For Loop
    // Q. Print numbers from 1 to 10 .
    // Q. Print (Your name) ‘n’ times. Take ‘n' input from user
// How For Loop works : the various parameters
    // Ques: Print numbers from 1 to 100
    // Print all even numbers from 1 to 100
    // HW: Print all odd numbers divisible by 3 from 1 to 100
    // Ques: Print the table of 17
    // Ques: Print numbers from ‘n’ to 1.
    // Display this AP - 2,5,8,11.. upto ‘n’ terms
    // Ques: Display this GP - 1,2,4,8.. upto ‘n’ terms
    // HW: Print this series - 99,95,91,87,.. upto all terms which are positive
    // Ques: Print all alphabets with their corresponding ASCII values.
    // HW: Take ‘n’ as input from user and print the following sequence..
// Break & continue
    // Ques: WAP to check if a given number is prime or not.
    // WAP to print if number is composite or not.
    // Ques: Print all even numbers from 1 to 100 Continue Statement'
    // Take a number input& print all of its factors.
// While Loop
// Do-While Loop
// Infinite Loop
// Ques: Count digits of a number
// Ques: Print sum of digits of a number
// Ques: Reverse of a number
// Ques: Factorial of a number
// Ques: ‘a’ raise to the power ‘b’