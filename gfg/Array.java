import java.util.Arrays;
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
        // arr[0] = 10;
        // arr[1] = 11;
        int[] arr = {5,-3,34,5,63,23,44};
        // ing n = arr.length;    // index -  0 to n-1
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
            // int y = sc.nextInt();
            // Vanshika[i] = y;     (or)
            Vanshika[i] = sc.nextInt();
        }
        System.out.println();
        // print
        for (int i = 0; i < 10; i++) {
            System.out.print(Vanshika[i] + " ");   
        }
        System.out.println();


        // Printing negative values
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr2 = new int[n];
        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter array Elements: ");
            arr2[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++)
            {
                if(arr2[i] < 0)  System.out.print("NUmber: " + arr2[i] + "  ");
            }


        // print sun of elements of array
        System.out.print("Enter size: ");
        int n2 = sc.nextInt();
        int[] arr3 = new int[n2];
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter your element to sum: ");
            arr3[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            sum += arr3[i];
        }
        System.out.println("Sum of elements is: "+ sum); 

        int[] arr4 = {3,5,6,3,-3,2,5,78,45,67,9,3};
        int max = arr4[0];
        // int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr4.length; i++)
        {
            if(arr4[i] > max)
            {
                max = arr4[i];
            }
        }
        System.out.println("MAX is : " +max);


        // passing array to methods
        int p[] = {1,4,5,34,3};
        System.out.println("Passing by value: " + p[2]);
        change(x);
        System.out.println("Passing by value: " + x[2]);


        // shallow copy and deep copy
        int[] arr5 = {10,20,30,40};
        int[] arr6 = arr5;  // shallow copy of array
        arr6[0] = 100;
        System.out.println(arr5[0]);

        int a = 4;  // 4 bytes leta hai ye
        int[] deep = Arrays.copyOf(arr5,arr5.length); // deep copy
        deep[2] = 100;
        System.out.println(deep[0]);
        System.out.println(arr5[2]);


        int[] arr = {3,35,6,7,4,2};
        


    }

    public static void change(int[] p){   // reference variable
            p[2] = 99;
    }
}
