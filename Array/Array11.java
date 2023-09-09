//find the missing number
//time complexity: O(n)
//space complexity: O(1)
public class Array11 {
    public class Find_Missing_number {
        public static void main(String[] args) {
            int arr[] = { 1, 2, 3, 7, 6, 5 };
            int n = arr.length;

            // sum of natural number in an array
            int sum_natural_number = ((n + 1) * (n + 2)) / 2;
            int sum = 0;

            // sum
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
            }

            int missing_ele = 0;
            missing_ele = sum_natural_number - sum;
            System.out.println("Missing element of array is: " + missing_ele);

        }

    }
    /*
     * // time complexity : O(n)
     * // space complexity: O(1)
     * 
     * public class Missing {
     * public static void main(String[] args){
     * int[] arr = {1, 2, 3, 7, 6, 5};
     * int n = arr.length;
     * // sum of natural numbers in an array - O(1)
     * int sum_natural_num = ((n+1)*(n+2))/2;
     * int sum = 0;
     * // sum of current elements present in an array - O(n)
     * for(int i=0; i<n; i++){
     * sum += arr[i];
     * }
     * 
     * int missing_elem = 0;
     * missing_elem = sum_natural_num - sum;
     * System.out.println("Missing element in an array is:"+missing_elem);
     * }
     * }
     */
}
