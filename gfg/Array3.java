import java.util.Arrays;
import java.util.Scanner;                  
import java.util.ArrayList;                  
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



        // MISSING IN ARRAY - GFG Practice

        // Segregate 0s and 1s  -  GFG Practice

        // Wave array - GFG Practice


        // ARRAYLIST  &  VECTOR IN JAVA
        ArrayList<Integer> arr3 =  new ArrayList<>();
        arr3.add(25);
        arr3.add(45);
        arr3.add(2);
        arr3.add(55);
        arr3.add(77);
        System.out.println(arr3.get(2));
        arr3.set(3,57);
        System.out.println(arr3);
        int n = arr3.size()
        for(int i  = 0; i < n ; i++)
        {
            System.out.print(arr3.get(i) + " ");
        }
        for(int elem : arr3)
        {
            System.out.print(elem + " ");
        }
        arr3.add(78);
        arr3.add(1,100); // 1 index pr 100 add krdo
        System.out.println(arr3);
        arr3.remove(arr3.size() - 1 ); // index
        System.out.println(arr3);
        Collections.reverse(arr3);
        System.out.println(arr3);
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
