public class searching{
    public static void main(String[] args) {
        System.out.println("Search");
        // Linear Search
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        int result = linearSearch(arr, target);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
        
    }
}