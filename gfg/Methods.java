import java.util.Scanner;

public class Methods 
{
    public static void Vanshika()    // Function with name Vanshika
    {
        System.out.println("Engineering");
    }
    public static void main(String[] args)  // Main Function
    {
        Scanner sc = new Scanner(System.in);

        System.out.println(Math.sqrt(4));  // built in function/methods
        System.out.println(Math.cbrt(125));  // built in function
        System.out.println(Math.PI);    // it is not method , Math class hai and PI - a variable
        System.out.println(Math.abs(-45));
        System.out.println(Math.floor(6.8)); // 6   // [-7.8] --> -8
        System.out.println(Math.ceil(3.0002));
        System.out.println(Math.min(3.45,9));
        System.out.println(Math.max(3.45,9));
        System.out.println(Math.max(Math.max(2,3),5)); // Max of three
        System.out.println(Math.max(Math.max(2,3),Math.max(7,5))); // Max of Four
        System.out.println(Math.pow(2,4));

        // SYNTAX
        Vanshika();
        System.out.println("BTech");
        Aayushi();
        sum(5,3, 4);   // ARGUMENTS
        max(4,2,5);
        // Vanshu();  // stand alone call
        System.out.println(Vanshu());  //sout(3+Vanshu()); it will add
        int x0 = Vanshu();
        System.out.println(3+x0);

        int x = rana(7);   // ----> 5
        System.out.println(3+x);  // 8

        System.out.println(maxim(5, 3, 4));

        int n = sc.nextInt();
        int r = sc.nextInt();

        int ncr = pandc(n)/(pandc(r)*pandc(n-r));
        int npr = pandc(n)/pandc(n-r);
        System.out.println(ncr + " " + npr);

        int z = 6;
        System.out.println(z);
        change(z);      // pass by value
        System.out.println(z); 

        System.out.print(n + " " + r);
        // System.out.println(swap(n,r));  not possible

    }
    public static void Aayushi()
    {
        System.out.println("Topper");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void max(int a , int b, int c)
    {
        System.out.println(Math.max(Math.max(a,b),c));
    }
    
    public static void sum(int a , int b , int c)  // PARAMETERS
    {
        System.out.println(a+b);
        // System.out.println(a+b+C);
    }


    public static int Vanshu()
    {
        System.out.println("Bansal");
        System.out.println("Gupta");
        return 0;    // finish 
    }

    public static int rana(int a)
    {
        System.out.println("Eng......");
        if(a>0) return 5;
        else  return 10;
    }

    public static int maxim(int a , int b, int c)
    {
        if(a>=b && a>=c) return a;
        else if(b>=a && b>=c) return b;
        else  return c;
    }


    public static int pandc(int pc)
    {
        int f = 1;
        for(int i = 1; i <= pc; i++)
        {
            f *= i;
        }
        return f;
    }

    public static void change(int z)
    {
       z = 10;
    }

    public static void swap(int a, int b)
    {
        int temp = a;
        a = b;
        b = temp;
    }
}



        // int nFact = 1;
        // for(int i = 1; i <= n; i++)
        // {
        //     nFact *= i;
        // }
        // int rFact = 1;
        // for(int i = 1; i <= n; i++)
        // {
        //     rFact *= i;
        // }
        // int nrFact = 1;
        // for(int i = 1; i <= n; i++)
        // {
        //     nrFact *= i;
        // }