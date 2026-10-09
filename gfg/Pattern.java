import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows : ");
        int row = sc.nextInt();
        System.out.print("Enter columns : ");
        int column = sc.nextInt();


        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < column; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();


        for(int i = 1; i <= row; i++)
        {
            for(int j = 1; j <= column ; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
        

        for(int i = 1; i <= row; i++)
        {
            for(int j = 1; j <= column; j++)
                {
                    System.out.print((char)(j+64) + " ");
                }
            System.out.println();
        }
        System.out.println();


        for(int i = 1; i <= row; i++)
        {
            for(int j = 1; j<= column; j++)
            {
                System.out.print((char)(j+96) + " ");
            }
            System.out.println();
        }
        System.out.println();


        for(int i = 1; i <= row; i++)
        {
            for(int j = 1; j <= column; j++)
            {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
        System.out.println();


        for(int i = 1; i <= row; i++)
        {
            for(int j = 1; j<= column; j++)
            {
                System.out.print((char)(i+64) + " ");
            }
            System.out.println();
        }
        System.out.println();


        for(int i = 1; i <= row; i++)
        {
            for(int j = 1; j <= column ; j++)
            {
                System.out.print((char)(i+96)+ " ");
            }
            System.out.println();
        }
        System.out.println();


        for(int i = 1; i <= row; i++)
        {
            for(int j = 1 ; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        
        
        for(int i = 1; i <= row; i++)
        {
            for(int j = 1 ; j <= i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        
        
        for(int i = 1; i <= row; i++)
        {
            for(int j = 1 ; j <= i; j++)
            {
                System.out.print((char)(i+64) + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        //Alphanumeric triangle
        for(int i = 1; i <= row; i++)
        {
            for(int j = 1 ; j <= i; j++)
            {
                if(i % 2 != 0)
                {
                    System.out.print(j + " ");
                }
                else
                {
                    System.out.print((char)(j+64) + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
        

        // STAR TRIANGLE HORIZONTALLY FLIPPED
        for(int i = 1; i <= row; i++)
        {
            for(int j = i; j <= column; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();


        for(int i = 1; i <= row; i++)
        {
            for(int j = i; j <= column; j++)
            {
                System.out.print((char)(j+96) + " ");
            }
            System.out.println();
        }
        System.out.println();


        for(int i = 1; i <= row; i++)
        {
            for(int j = i; j <= column; j++)
            {
                System.out.print((char)(i+64) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
