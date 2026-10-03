// The Sieve of Eratosthenes
// The Sieve of Eratosthenes is an ancient, efficient
// algorithm used to find all prime numbers up to a 
// specified integer(n).

// OPTIMIZATION OF ANY ALGORITHM IS A MUST IN COMPETITIVE PROGRAMMING


// public class Main
// {
//     public static void main(String[] args) 
//     {
//       // Scanner sc = new Scanner(System.in);
//       // int n = sc.nextInt();
//       int n = 6;
//       int space = 1;
//       for(int r = 1; r <= n ; r++)
//       {
//         for(int sp = 1; sp <= n - r ; sp++)
//             {
//                 System.out.print("  ");
//             }
//             if(r == 1)
//             {
//               System.out.print("* ");
//             }
//             else if(r == n)
//             {
//               for(int i = 1; i <= (2*n - 1); i++)
//               {
//                 System.out.print("* ");
//               }
//             }
//             else{
//               System.out.print("* ");
//               for(int i = 1; i <= space; i++)
//               {
//                 System.out.print("  ");
//               }
//               space += 2;
//               System.out.print("* ");
//             }
//             System.out.println();
            
//       }
//     }
// }



// public class Solution 
// {
//   public static void main(String[] args) 
//   {
//     int n = 5;
//     for(int r = n; r >= 1 ; r--)
//     {
//       for(int c = 1; c <= r; c++)
//       {
//         if(r == n || c == 1 || c == r)
//         {
//           System.out.print("* ");
//         }
//         else
//         {
//           System.out.print("  ");
//         }
//       }
//       System.out.println();
//     }
//   }
// }


// public class Solution
// {
//   public static void main(String[] args) 
//   {
//       int[] numbers = {1,4,0,7,2,3};
//       int max = 0;
//       for(int num : numbers)
//       {
//         if(num > max)
//         {
//           max = num;
//         }
//       }
//       for(int i = max; i >= 1; i--)
//       {
//         for(int num : numbers)
//         {
//           if(num >= i)
//           {
//             System.out.print("* ");
//           }
//           else
//           {
//             System.out.print("  ");
//           }
//         }
//         System.out.println("");
//       }
//   }
// }



// You are given year 2026 and u have to find next (n) leap years
// n = 5 (400) or (4 but not 100)
// import java.util.*;

// public class Main 
// {
//   public static void main(String[] args) 
//     {
//       int year = 2026;
//       int n  =  5;

//       while(n > 0)
//       {
//         if(isLeapyear(year))
//         {
//           System.out.println("LeapYear : " + year);
//           n--;
//         }
//         year++;
//       }
//     }
//       public static boolean isLeapyear(int year)
//       {
//         if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
//           return true;
//         return false;
//       }
// }


// you are given n and u have to find first n prime numbers (n = 10)
// import java.util.*;

// public class Main 
// {
//     public static void main(String[] args) 
//     {  
//       int n  =  10;
//       int start = 2;
//       while(n > 0)
//       {
//         if(isPrime(start))
//         {
//           System.out.println(start);
//           n--;
//         }
//         start++;
//       }
//     }
//     public static boolean isPrime(int val)
//     {
//       for(int i = 2; i <= val - 1 ; i++)
//       {
//         if((val % i == 0))
//         {
//           return false;
//         }
//       }
//     return true;
//     }
// }



// you have given a number and you have to find out is given number strong or not 
// 145 -> 1! + 4! + 5!  -->  1 + 24 + 120  -->  145
// armstrong 153 -> 1 (cube) + 5(cube) + 3(cube) --> 1 + 125 + 9  -->  153

// import java.util.*;

// public class Main 
// {
//     public static void main(String[] args) 
//     { 
//       int a = 145 ;
//       System.out.println(isStrong(a));
//     }
//     public static boolean isStrong(int n)
//     {
//       int temp = n;
//       int sum = 0;
//       while( n > 0)
//       {
//         int d = n % 10 ;
//         int fac = 1;
//         for(int i = 1 ; i <= d ; i++)
//         {
//           fac *= i;
//         }
//         sum += fac;
//         n /= 10;
//       }
//       return sum == temp ;
//     }
// }




// ARRAY
// Collection of similar data types , array is a object
// Array indexing start from 0 bcz ----> ((size of element * index) + base Address)
// STACK MEMORY(FUNCTIONS) || HEAP MEMORY(OBJECT)  {META SPACE}
// import java.util.*;
// public class Main{

//     public static void main(String[] args)
//     {
//       int a = 5;
//       int b = a;
//       a = 10;
//       System.out.println(a);
//       System.out.println(b);
      
//       int[] arr = {1,2,4,5};
// // arr in stack memory    ---(object reference)--->    {1,2,4,5}(0,1,2,3) [index] in heap memory
//       int[] arr2 = arr;
//       System.out.println(arr);
//       System.out.println(arr2);    // same address
//       System.out.println(arr[0]);
//       arr[0] = 0;
//       System.out.println(arr[0]);
//       System.out.println(arr2[0]);    // same address
//       System.out.println(arr.length);

//       int[] arr3 = new int[5];
//       arr3[1] = 100;
//       System.out.println(arr3);
//       for(int i = 0; i < arr.length; i++)
//       {
//         System.out.print(arr3[i] + " ");
//       }

//       System.out.print(Arrays.toString(arr3));

//       // agr kisi string me character get krna hai to
//       String str = Arrays.toString(arr3);
//       System.out.println(str.charAt(0));

//       //  Garbage Collection jb object ko koi variable point na kre to GC uss unwanted memory ko remove krdega automatically....
//       int[] arr4 = {1,2,4,5};
//       int[] arr5 = new int[arr4.length];
//       int[] arr6 = arr4.clone();
//       arr4[0] = 100;
//       System.out.println(arr4[0]);
//       System.out.println(arr5[0]);
//     }
// }



// for each loop
// for(int ele : arr)
// {
//   System.out.println(arr)l
// }

public class Main {
    public static void main(String[] args) {
      int a = 153;
      System.out.println(isArmStrong(a));
    }
    public static boolean isArmStrong(int n)
    {
      int temp = n;
      int sum = 0;
      while(n > 0)
      {
        int digit = n % 10;
        sum = sum + (digit * digit * digit);
        n = n / 10;
      }
      if (temp == sum) 
      {
        return true;
      }
      else
      {
        return false;
      }
      // return (temp == sum ? "Armstrong" : "Not Armstrong");
    }
}