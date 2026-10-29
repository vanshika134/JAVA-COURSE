import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
        


        // ROTATE ARRAY  (imppppppppppppppppp) - (GFG Practice)
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
        arr3.add(29);
        arr3.add(55);
        arr3.add(77);
        System.out.println(arr3.get(2));
        arr3.set(3,57);
        System.out.println(arr3);  // all arraylist will be print  (int backend it takes loop and print)
        int nk = arr3.size();
        for(int i  = 0; i < nk ; i++)
        {
            System.out.print(arr3.get(i) + " ");
        }
        for(int elem : arr3)
        {
            System.out.print(elem + " ");
        }
        System.out.println();
        arr3.add(78);
        arr3.add(1,100); // 1 index pr 100 add krdo
        System.out.println(arr3);
        arr3.remove(arr3.size() - 1 ); // index
        System.out.println(arr3);

        Collections.reverse(arr3);      
        System.out.println(arr3);
        
        int k = 0, l = arr3.size()-1;
        while(k < l)
            {
                int tempr = arr3.get(k);
                arr3.set(k, arr3.get(l));
                arr3.set(l , tempr);
                k++;
                l--;
            }
        System.out.println(arr3);

        ArrayList<Character> arr4 = new ArrayList<>();
        ArrayList<Double> arr5 = new ArrayList<>();
        ArrayList<String> arr6 = new ArrayList<>();


        // ADDING ONE - GFG PRACTICE
        // Addition of two numbers {3,5,2,9,7} + {9,2,1} 

        // Merge 2 Sorted Arrays in a single big array - 2 Pointer Technique
        int[] array = {2,5,6,9};
        int[] array_2 = {2,9,3,5,3,5,7,0};
        int[] mrg = new int[array.length + array_2.length];
        for(int ele : mrg)  System.out.print(ele + " ");
        System.out.println();
        merge(mrg,array,array_2);
        for(int ele : mrg)  System.out.print(ele + " ");
        System.out.println();
        


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

    public static void merge(int[] mrg , int[] array , int[] array_2)
    {
        int i = 0, j = 0, k = 0;
        while( i < array.length && j < array_2.length)
        {
            if(array[i] < array_2[j])
            {
                // or mrg[k++] = array[i++];
                mrg[k] = array[i];
                i++;
                k++;
            }
            else
            {
                // or mrg[k++] = array_2[j++];
                mrg[k] = array_2[j];
                j++;
                k++;
            }
        }
        while(i<array.length)
        {
            mrg[k++] = array[i++];
        }
        while(j<array_2.length)
        {
            mrg[k++] = array[j++];
        }
    }
}





