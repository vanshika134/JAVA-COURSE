import java.util.Scanner;
public class Array 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
    
        int[] x = {3,52,2,32,12,3};
        // indexing
        System.out.println(x[5]);  // access
        // updating - mutable
        x[3] = 86;
        System.out.println(x[3]);


        // int[] arr = new int[10]; // 10 length ka array (empty array initialize)
        int[] arr = {5,-3,34,5,63,23,44};
        // ing n = arr.length;
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        int[] Vanshika = new int[10];
        // default values
        for (int i = 0; i < 10; i++) {
            System.out.print(Vanshika[i] + " ");
        }
        System.out.println();
        // input
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number "+i + " : ");
            int y = sc.nextInt();
            Vanshika[i] = y;
            // or Vanshika[i] = sc.nextInt();
        }
        System.out.println();
        // print
        for (int i = 0; i < 10; i++) {
            System.out.print(Vanshika[i] + " ");   
        }
        System.out.println();

    }
}
