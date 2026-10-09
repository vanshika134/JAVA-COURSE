import java.util.Scanner;

public class MorePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows : ");
        int row = sc.nextInt();
        System.out.print("Enter columns : ");
        int column = sc.nextInt();

        // HOLLOW RECTANGLE
        for(int i = 1; i <= row; i++)
        {
            for(int j = 1; j <= column; j++)
            {
                if(i == 1 || i == (row) || j == 1 || j == (column))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        
        
        // STAR PLUS(Odd)
        for(int i = 1; i <= row; i++)
        {
            for(int j = 1; j <= column; j++)
            {
                int mid = (row/2)+1;
                if(i == mid || j == mid)
                {
                    System.out.print("* ");
                }
                else
                    {
                    System.out.print("  ");
                }
            }
                
            System.out.println();
        }
        System.out.println();


        // CROSS STAR 
        for(int i = 1; i <= row; i++)
            {
            for(int j = 1; j <= column; j++)
                {
                    if(i == j || (j == (row + 1 - i)))
                    {
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            System.out.println();


            // FLOYD'S TRIANGLE
            int num = 1;
            for(int i = 1; i <= row; i++)
            {
                for(int j = 1; j <= i; j++)
                {
                    System.out.print(num + " ");
                    num++;
                }
                System.out.println();
            }
            System.out.println();


            // BINARY TRAINGLE(all zeros are odd i + j)
            for(int i = 1; i <= row; i++)
            {
                for (int j = 1; j <= i; j++) {
                    if((i+j)%2 == 0)
                    {
                        System.out.print(1 + " ");
                    }
                    else{
                        System.out.print(0 + " ");
                    }
                }
                System.out.println();
            }
            System.out.println();


            // STAR TRAINGLE 
            for(int i = 1; i <= row; i++)
            {
                for(int j = 1; j <= column; j++)
                {
                    if()
                }
            }
    }
}
