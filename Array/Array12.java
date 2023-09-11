// Given an array of integers {2, 6, -5, -1, 0, 4, -9}, print only the positive values present in the array.
//time complexity: O(n)
//space complexity: O(1)
public class Array12 {
   public static void main(String[] args) {
      int[] arr = { 2, 6, -5, -1, 0, 4, -9 };
      System.out.print("Positive values in the array: ");
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] > 0) {
            System.out.print(arr[i] + " ");
         }
      }
   }
}
