import java.util.Arrays;
import java.util.Scanner;
public class Array 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
    
        int[] x1 = {3,52,2,32,12,3};
        // indexing
        System.out.println(x1[5]);  // access
        // updating - mutable
        x1[3] = 86;
        System.out.println(x1[3]);


        // int[] arr = new int[10]; // 10 length ka array (empty array initialize)
        // arr[0] = 10;
        // arr[1] = 11;
        int[] arr = {5,-3,34,5,63,23,44};
        // int n = arr.length;    // index -  0 to n-1
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        // int[] a;    reference variable
        int[] Vanshika = new int[10];

        // default values
        for (int i = 0; i < 10; i++) {
            System.out.print(Vanshika[i] + " ");
        }

        System.out.println();

        // input values leni hai
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number "+i + " : ");
            // int y = sc.nextInt();
            // Vanshika[i] = y;     (or)
            Vanshika[i] = sc.nextInt();
        }
        System.out.println();
        // print
        for (int i = 0; i < 10; i++) {
            System.out.print(Vanshika[i] + "");   
            System.out.print("-" + Vanshika[i]*2 + "   ");   
        }
        System.out.println();


        // PRINTING NEGATIVE VALUES
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr2 = new int[n];
        System.out.print("Enter array Elements: ");
            //input
        for(int i = 0; i < n; i++)
        {
            arr2[i] = sc.nextInt();
        }
            //print
        for(int i = 0; i < n; i++)
        {
            if(arr2[i] < 0)  System.out.print("Number: " + arr2[i] + "  ");
        }


        // PRINT SUM OF ELEMENTS OF ARRAY
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


        //PRINT PRODUCT OF ELEMENTS OF ARRAY [int product = 1;]   ( product  *=  arr[ i ] )
        System.out.println("Enter size to product : ");
        int num = sc.nextInt();
        int[] array = new int[num];
        int product = 1;
        for(int i = 0 ; i < num ; i++)
            {
                System.out.print("Enter your elements : " );
                array[i] = sc.nextInt();
            } 
        for(int i = 0; i < n; i++)
        {
            product *= array[i];
        }
        System.out.println("Product is : " + product);


        // PRINT MAXIMUM ELEMENT OF THE ARRAY (Largest element in Array - GFG)
        int[] arr4 = {3,5,6,3,-3,2,5,78,45,67,9,3};
        int max = arr4[0];        // int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr4.length; i++)
        {
            if(arr4[i] > max)
            {
                max = arr4[i];
            }
        }
        System.out.println("MAXIMUM NUMBER IS : " +max);

        // PRINT MINIMUM ELEMENT IN ARRAY


        // Array Index Out of Bound Exception.........


        // Array of other data types
        double[] point = new double[8];    // 0.0   0.0   0.0 ....
        // char[] ch = new char[8];
        // String[] arr = {"Vanshi". "Vanshika".....};
        for(int i = 0; i < point.length; i++)
        {
            System.out.print(point[i] + " ");
        }
        System.out.println();



        // passing array to methods/functions
        int p[] = {1,4,5,34,3};
        System.out.println("Passing by value : " + p[2]);
        change(p); // whenever we pass array to methods , the array is passed by reference , it can be changed
        System.out.println("Passing by value(after): " + p[2]);


        // shallow copy and deep copy
        int[] arr5 = {10,20,30,40};
        int[] arr6 = arr5;  // arr6 is shallow copy of arr5 , array ka sirf naam bdla hai lekin hai vhi (dusre variable ke naam se original me change krr skte hain)
        arr6[3] = 100;
        System.out.println("Shallow " + arr5[3]);

        int a = 4;  // 4 bytes leta hai ye
        // int[] arr = {10,20,30,40}; // 16 bytes continuous/contiguous memory allocation
        int[] deep = Arrays.copyOf(arr5,arr5.length); // deep copy  (CAMEL CASE)
        deep[2] = 100;     // new array bna ke usme change hua , real change nhi hui
        System.out.println(deep[2]);
        System.out.println(arr5[2]);


        // Another method for deep copy.......
        // int[] arr = (10,20,30,40);
        // int[] brr = new int[arr.length];
        // for (int i = 0; i < arr.length; i++) {
        //     brr[i] = arr[i];
        // }
    }
    public static void change(int[] p) {    // reference variable
        p[2] = 99;             // p ko same values aa gyi
    }

}