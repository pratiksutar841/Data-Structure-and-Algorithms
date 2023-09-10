// Traverse over the elements of the array {1,2,3,4,5,6,7,8} using for each loop and print all even
//elements.
public class Array13
{
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.print("Even elements in the array: ");
        for (int num : arr) 
        {
            if (num % 2 == 0) 
            {
                System.out.print(num + " ");
            }
        }
    }
}