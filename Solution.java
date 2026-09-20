// The Sieve of Eratosthenes
// The Sieve of Eratosthenes is an ancient, efficient
// algorithm used to find all prime numbers up to a 
// specified integer(n).

// OPTIMIZATION OF ANY ALGORITHM IS A MUST IN COMPETITIVE PROGRAMMING


// public class Solution
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


public class Solution
{
  public static void main(String[] args) 
  {
      int[] numbers = {1,4,0,7,2,3};
      int max = 0;
      for(int num : numbers)
      {
        if(num > max)
        {
          max = num;
        }
      }
      for(int i = max; i >= 1; i--)
      {
        for(int num : numbers)
        {
          if(num >= i)
          {
            System.out.print("* ");
          }
          else
          {
            System.out.print("  ");
          }
        }
        System.out.println("");
      }
  }
}