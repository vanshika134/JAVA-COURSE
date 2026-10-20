import java.util.Scanner;

public class MorePattern 
{
    public static void main(String[] args) 
    {
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
        
        
        // STAR PLUS('n' is Odd)
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


        // CROSS STAR (input ODD......)
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
            for (int j = 1; j <= i; j++) 
            {
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


        // ODD NUMBER TRIANGLE
        for(int i = 1; i <= row; i++)
        {
            int b = 1;
            for(int j = 1; j <= i; j++)
            {
                System.out.print(b + " ");   // 2 * j - 1
                b = b + 2;
            }
            System.out.println();
        }
        System.out.println();


        // STAR TRAINGLE VERTICALLY FLIPPED                    
        for(int i = 1; i <= row; i++)     // considering a square
        {
            for(int j = 1; j <= column; j++)
            {
                if((i+j) > row)  // if square
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

        // STAR TRAINGLE VERTICALLY FLIPPED
        for (int i = 1; i <= row; i++) 
        {
            for(int j = 1; j <= column -i; j++)  // kyuki ek km star chahiye
            {
                System.out.print("  ");
            }   
            for(int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // Pyramid (one by giving single space in 2 loop)


        // Number Triangle Vertically Flipped
        for(int i = 1; i <= row; i++)
        {
            for (int j = 1; j <= column - i; j++) 
            {
                System.out.print("  ");    
            }
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(j + " ");    
            }
            System.out.println();
        }
        System.out.println();


        //Alphabet Triangle Vertically Flipped A  BB  CCC  DDD



        // RHOMBUS
        for(int i = 1; i <= row; i++)
        {
            for (int j = 1; j <= column - i; j++) 
            {
                System.out.print("  ");    
            }
            for (int j = 1; j <= row; j++) 
            {
                // System.out.print(j + " ");    
                System.out.print("*" + " ");    
            }
            System.out.println();
        }
        System.out.println();


        // Double flipped triangle
        for (int i = 0; i < 10; i++) {
            
        }


        // Pyramid
        for(int i = 1; i <= row; i++)
        {
            for (int j = 1; j <= column - i; j++) 
            {
                System.out.print("  ");    
            }
            for (int j = 1; j <= 2*i-1 ; j++) 
            {
                System.out.print("*" + " ");    
            }
            System.out.println();
        }
        System.out.println();
        // nsp = n - 1
        // nst = 1
        // after a new line nst += 2, nsp -= 1
        int nwnsp = row - 1, nwnst = 1; 
        for(int i = 1; i <= row; i++)
        {
            for (int j = 1; j <= nwnsp; j++) 
            {
                System.out.print("  ");    
            }
            for (int j = 1; j <= nwnst ; j++) 
            {
                System.out.print("*" + " ");    
            }
            nwnsp--;
            nwnst += 2;
            System.out.println();
        }
        System.out.println();



        // Diamond
        int n = sc.nextInt();
        int nsp = n-1, nst = 1;  // number of spaces and stars
        for(int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= nsp; j++) 
            {
                System.out.print("  ");    
            }
            for (int j = 1; j <= nst; j++) 
            {
                System.out.print("*" + " ");    
            }
            nsp--;
            nst += 2;
            System.out.println();
        }
        nsp = 1;
        nst = 2*n-3;
        for(int i = 1; i <= n-1; i++)
        {
            for (int j = 1; j <= nsp; j++) 
            {
                System.out.print("  ");    
            }
            for (int j = 1; j <= nst; j++) 
            {
                System.out.print("*" + " ");    
            }
            nsp++;
            nst -= 2;
            System.out.println();
        }
        System.out.println();


        // Bridge
        for (int i = 1; i <= 2*n-1; i++) 
        {
            System.out.print("* ");   
        }
        System.out.println();
        int nstp = 1;
        for(int i = 1; i <= n-1; i++)
        {
            for(int j = 1; j <= n-i; j++)
            {
                System.out.print("* ");
            }
            for(int j = 1; j <= nstp; j++)
            {
                System.out.print("  ");
            }
            for(int j = 1; j <= n-i; j++)
            {
                System.out.print("* ");
            }
            nstp += 2;
            System.out.println();
        }
        System.out.println();


        // Number Spiral
        for(int i = 1; i <= 2*n-1 ; i++)
        {
            for(int j = 1; j <= 2*n-1; j++)
            {
                int a = i, b = j;
                if(i > n) a = 2*n-i;
                if(j > n) b = 2*n-j;
                System.out.print(Math.min(a,b) + " ");
            }
            System.out.println();
        }
    }
}
