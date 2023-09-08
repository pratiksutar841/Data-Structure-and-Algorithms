// find the  number is palindromic or not
//time complexity: O(n)
//space complexity: O(1)
public class Array1 {
          public static void main(String[] args) {
                    int arr[] = { 1, 2, 3, 4, 5, 4, 3, 2, 1 };
                    int n = arr.length;
                    int flag = 0;
                    for (int i = 0; i <= n / 2; i++) {
                              if (arr[i] != arr[n - i - 1]) {
                                        flag = 1;
                                        System.out.println("It is not palindromic number");
                                        break;
                              }
                    }
                    if (flag == 0) {
                              System.out.println("It is a palindronic number");
                    }

          }

}
