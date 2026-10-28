import java.util.Arrays;
import java.util.Scanner;
public class Array2 {
    
    // SORT METHOD IN ARRAY - ASCENDING ORDER
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {4,5,7,5,-2,5};
        print(arr);
        Arrays.sort(arr);
        print(arr);


        // MULTIPLY ODD INDEXED ELEMENTS BY 2 & ADD 10 TO EVEN INDEXED ELEMENTS
        int[] arr2 = new int[10];
        System.out.println("Enter 10 integers:");

        for(int i = 0 ; i < arr2.length; i++)
        {
            arr2[i] = sc.nextInt();
        }
        for(int i = 0 ; i < arr2.length; i++)
        {
            if(i % 2 == 1)
                arr2[i] *= 2;
            else
                arr2[i] += 10;
        }
        System.out.println("Modified array: " + Arrays.toString(arr2));


        // SEARCH IN ARRAY   Linear search
        // int x to search , array
        int[] arr3 = {1,2,3,4,5};
        int target = 3;
        // int found = -1;    other way withour boolean
        boolean flag = false;  // element target me nhi hain
        for (int i = 0; i < arr3.length; i++) {
            if(arr3[i] == target)
            {
                System.out.println("Target Exist at index: " + i);
                flag = true; // target array me hai
                break;
            }
        }
        // if(flag==true)   System.out.print("Target exist"); if(flag)
        if(!flag)     System.out.println("Not exist"); //(flag==false)
        

        // TWO SUM    --  {GFG PRACTICE......}
        int[] arr4 = {0,1,2,3,4,5,6,7,8,9};
        int target2 = 5;
        for(int i = 0; i < arr4.length ; i++)
        {
            for(int j = i+1; j < arr4.length; j++)
            {
                if(arr4[i] + arr4[j] == target2)
                {
                    System.out.print(arr4[i] + "," + arr4[j]+ "    "); // return true
                }
            }
        }
        // returnh false


        System.out.println();

        // Print the second maximum element in the array
        int[] arr5 = {1,6,5,8,4,9,6};
        int maxi = Integer.MIN_VALUE;
        int s_max = Integer.MIN_VALUE;
        for(int i = 0; i < arr5.length; i++)
        {
            if(arr5[i] > maxi)
            {
                maxi = arr5[i];
            }
        }
        for(int i = 0; i < arr5.length; i++)
        {
            if(arr5[i] != maxi && arr5[i] > s_max )
            {
                s_max = arr5[i];
            }
        }
        System.out.println(maxi);
        System.out.println(s_max);


        System.out.println();

        // REVERSE ARRAY (TWO POINTER/VARIABLE TECHNIQUE)
        int[] arr6 = { 3 , 6 , 4 , 2 , 8 , 9 };
        int i = 0 , p = arr6.length - 1;
        while( i < p )
        {
            int temp = arr6 [i];
            arr6 [i] = arr6 [p];
            arr6 [p] = temp;
            i++;
            p--;
        }
        for( int ele : arr6 )
        {
            System.out.print(ele + " ");
        }
        // IF WE WANT TO SWAP FROM ONE POINT TO ANOTHER (i = 3, j = 7) reverse part of array

        // swap arr[i] and arr[n-1-i]
        // for(int i = 0; i < n/2 ; i++)
        // {
        //     int temp = arr[i];
        //     arr[i] = arr[n-1-i];
        //     arr[n-1-i] = temp;
        // } 



    }



    public static void print(int[] arr) {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    // public static boolean twoSum(int arr[], int target)
    // {
    //     int n = arr.length;
    //     for(int i = 0; i < n ; i++)
    //     {
    //         for(int j = i+1; j < n; j++)
    //         {
    //             if(arr[i] + arr[j] == target2)
    //             {
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

}
