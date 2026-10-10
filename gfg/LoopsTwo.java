
import java.util.Scanner;

public class LoopsTwo {
    public static void main(String[] args) {
        // count digits of a number
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number to count its digits: ");
        int num = sc.nextInt();
        if(num == 0) num = 1;
        int i = 0;
        while(num != 0)
            {
                num = num/10;
                i++;
            }
            System.out.println(i);
            
            
        System.out.print("Enter number to sum its digits: ");
        int num2 = sc.nextInt();
        if(num2 < 0) num2  =  -num2;
        int sum = 0;
        while(num2 != 0)
        {
            // num2 = num2%10;
            sum = sum + (num2%10);
            num2 = num2/10;
        }
        System.out.println(sum);
        
        
        // Limits of int
        int x = Integer.MAX_VALUE;
        System.out.println(x);
        int y = Integer.MIN_VALUE;
        System.out.println(y);
        long z = (long)2147483647+ 10;
        System.out.println(z);
        long a = Long.MAX_VALUE;
        System.out.println(a);

        System.out.print("Enter number to reverse its digits: ");
        int num3 = sc.nextInt();
        int rev = 0;
        while(num3 > 0)
            {
            rev = rev * 10;
            rev = rev + (num3 % 10);
            num3 = num3/10;
        }
        System.out.println(rev);

        System.out.print("Enter number for its factorial: ");
        int num4 = sc.nextInt();
        int j = 1;
        // int fact = 1;
        long fact = 1;
        while(j <= num4)
        {
            fact = fact * j;
            j++;
            // System.out.println(fact);
        }
        System.out.println(fact);

        // 'a'(num5) raise to the power 'b'(num6)
        System.out.print("Enter number: ");
        int num5 = sc.nextInt();
        int num6 = sc.nextInt();
        int pow = 1;
        for(int k = 1; k <= num6; k++)
        {
            pow *= num5;
        }
        System.out.println(num5 + " Raise to power " + num6 + " is " + pow);

    }
}
