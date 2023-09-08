
/*Q1: Take m and n input from the user and m * n integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0.
Input 1: 
  
1  2  -3  4
0  0  -4  2
1 -1   2  3
-4 -5 -7  0

Output :
number of positive numbers = 7
number of negative numbers = 6
number of odd numbers = 7
number of even numbers = 9
number of 0 = 3 
Time complexity: O(n*m) where n = number of rows , m = number of columns
Space complexity: O(1)
*/
import java.io.*;
import java.util.*;

public class Array2D1 {
      public static void main(String args[]) {

            int m, n;
            Scanner sc = new Scanner(System.in);
            System.out.print("enter the number of rows=");
            m = sc.nextInt();
            System.out.print("enter the number of column=");
            n = sc.nextInt();
            int arr[][] = new int[m][n];

            int i, j;

            System.out.println("enter the  matrix element=\n");
            for (i = 0; i < m; i++) {
                  for (j = 0; j < n; j++) {
                        arr[i][j] = sc.nextInt();
                  }
            }
            int positive = 0, negative = 0, zero = 0, odd = 0, even = 0;
            for (i = 0; i < m; i++) {
                  for (j = 0; j < n; j++) {
                        if (arr[i][j] > 0)
                              positive++;
                        if (arr[i][j] < 0)
                              negative++;
                        if (arr[i][j] == 0)
                              zero++;
                        if ((arr[i][j] % 2) == 0)
                              even++;
                        if ((arr[i][j] % 2) != 0)
                              odd++;
                  }
            }

            System.out.println("Number of positives = " + positive);
            System.out.println("Number of negatives = " + negative);
            System.out.println("Number of odds = " + odd);
            System.out.println("Number of evens = " + even);
            System.out.println("Number of zeroes = " + zero);
      }
}