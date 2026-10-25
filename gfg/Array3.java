import java.util.Arrays;
import java.util.Scanner;                  
public class Array3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // FOR EACH LOOP...........
        int[] arr = {5,8,5,3,2};
        // int element in for int element in the array
        for(int ele : arr)  //  array ke element ki ek copy bnti hai we cannot change elements that's why only used to traverse
        {
            System.out.print(ele + " ");
            // ele *= 2; // impossible......
        }
        


        // ROTATE ARRAY  (imppppppppppppppppp)
        int[] arr2 = {4,5,7,2,6,8,4};
        System.out.print("Enter rotation steps (d): ");
        int d = sc.nextInt();
        int n = arr.length;
        d = d % n;
        reverse(arr , 0 , d - 1);
        reverse(arr , d , n - 1);
        reverse(arr , 0 , n - 1);
        System.out.println("Rotated Array: " + Arrays.toString(arr2));



        // MISSING IN ARRAY
        }



    static void reverse(int[] arr , int i , int j)
    {
        while(i < j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--; 
        }
    }
}
