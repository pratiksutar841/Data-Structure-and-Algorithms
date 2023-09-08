//Reverse of Array
//time complexity: O(n)
//space complexity: O(1)
public class Array2 {
          public static void main(String[] args) {
                    int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
                    int n = arr.length;

                    for (int i = 0; i < n / 2; i++) {
                              // swap the elements between arr[i] and arr[n-i-1]

                              int temp = arr[i];
                              arr[i] = arr[n - i - 1];
                              arr[n - i - 1] = temp;

                    }
                    System.out.println("Reverse of arrays is");
                    for (int i = 0; i < n; i++) {
                              System.out.print(arr[i] + " ");
                    }

                    // System.out.println();
          }
}
