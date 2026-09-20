public class whileloop {
    public static void main(String a[])
    {
        // repeat this statement 4 times
        // Loops - while , do while , for
        // condition 


        // WHILE LOOP :

        // while(true)
        // {
        //     System.out.println("Hi!"); INFININTE LOOP
        // }

        // int i = 1;
        // while(i <= 5)
        // {
        //         System.out.println("Hi! " + i);
        //         i++;
        // }
        // System.out.println("Bye " + i);
        
        int i = 1;
        while(i <= 5)    // nested while loop
        {
                System.out.println("Hi! " + i);
                int j = 1;
                while(j<=3)
                {
                    System.out.println("Hello! "+j);
                    j++;
                }
                i++;       
        }
        System.out.println("Bye " + i);

    }
}
