public class Conditional 
{
    public static void main(String[] args)
    {
        // if(true)     it will print Hello!
        //     System.out.println("Hello!");
        // if(false)    it will not print Hello!
        //     System.out.println("Hello!");
        
        // int x = 18;
        // if(x>10 && x <= 20)
        // {
        //     System.out.println("Hello! " + x);
        // }
        // else
        // {
        //     System.out.println("Bye! " + x);
        // }

        // int x = 5;
        // int y = 7;
        // if(x > y)
        // {
        //     System.out.println(x);
        // }
        // else if(x == y)
        // {
        //     System.out.println(x + y);
        // }
        // else
        // {
        //     System.out.println(y);
        // }

        int x = 10;
        int y = 23;
        int z = 100;
        if(x > y && x > z)
        {
            System.out.println("Greater x : " + x);
        }
        // else if(y > x && y > z)
        else if(y > z)
        {
            System.out.println("Greater y : " + y);
        }
        else
        {
            System.out.println("Greater z : " + z);
        }
    }
}


