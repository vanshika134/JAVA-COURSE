public class forloop 
{
    public static void main(String a[])
    {

        // int i;
        // for ( i = 1 ; i <= 5 ; i++ )
        // {
        //     System.out.println("Hi " + i);
        // }

        for(int i = 1; i <= 5; i++)
        {
            System.out.println("DAY " + i);
            for(int j = 1 ; j <= 9; j++)
            {
                System.out.println("    " +(j + 8) + " - " + (j+9));

            }
        }

        // ALSO  

        int i = 1;
        for(; i <= 5 ;)
        {
            System.out.println("DAY " + i);
            i++;
        }
    }

}


