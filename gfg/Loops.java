import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        for(int i = 0; i < 101; i+=2)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        
        for(int i = 17; i <= 170; i+=17)
        {
            System.out.print(i + " ");
            // System.out.print(i*17 + " ");
        }
        System.out.println();
        
        int n = sc.nextInt();
        
        for(int i = 2; i <= (3 * n - 1); i+=3)
        {
            System.out.print(i + " ");
        }
        System.out.println();

        int a = 1 , r = 2;
        
        for(int i = 1; i <= n; i++)
        {
            System.out.print(a + " ");      //GP-Geometric Progression
            a *= r;
        }
        
        for(int i = 0; i <= n; i++)
        {
            System.out.println(i + " " + (n - i));
        }
        
        for(int i = 65; i <= 90; i++)
        {
            System.out.println((char)i + " " + i);
        }

        for(int i = 2 ; i <= n-1; i++)
        {
            if(n%i == 0)
            {
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");

        
    }
}
