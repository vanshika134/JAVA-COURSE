public class Sorting {
    // CHECK SORTED ARRAY  --  GFG PRACTICE
    public static void print(int[] arr)
    {
        for(int ele : arr)  System.out.print(ele + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        // BUBBLE SORT  --  Swap Adjacent Elements
        int[] arr = {5,-2,4,7,9,4,2,1,0};
        int n = arr.length;
        print(arr);
        // After each subsequent pass, the largest element will be at the end of the array  (n-1-i)     iske liye complexity O(n^2) hai
        // n - 1 ke liye (n-1)^2 complexity 
        for(int i = 0; i < n-1; i++)    // O(n^2)
        {
            for(int j = 0; j < n-1-i; j++)
            {                  
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }     
        }
        print(arr);
    }
}
         