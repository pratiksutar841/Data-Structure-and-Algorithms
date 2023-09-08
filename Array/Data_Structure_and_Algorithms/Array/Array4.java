package Data_Structure_and_Algorithms.Array;

import java.util.*;
public class Array4
{
     public static int getLargest(int numbers[])
          {
               int largest = Integer.MIN_VALUE;  //-infinity
               int smallest = Integer.MAX_VALUE; //+infinity
                  for (int i = 0; i < numbers.length; i++) 
                  {
                      if (largest<numbers[i]) 
                      {
                          largest=numbers[i];
                       }
                      if (smallest>numbers[i]) 
                      {
                         smallest=numbers[i];     
                       }
                  }
           System.out.println("Smallest number is : "+smallest);
                    return largest;
          }
       public static void main(String[] args) 
       {
          int numbers[]={1,2,6,3,5};
          System.out.println("Largest value is : "+getLargest(numbers));
         
       }   
}
 /*
 Q3: Write a program to calculate the maximum element in the array.
Input 1: arr[] = {34,21,54,65,43}
Output 1: 65
Input 1: arr[] = {4,3,6,7,1}
Output 1: 7

public class MaximunNumberInArray 
{
  public static void main(String[] args) 
  {
          int[] arr = { 10, 7, -5, 8, 9, 0, -4 };
          int max = Integer.MIN_VALUE;
          for (int val : arr) 
          {
              max = Math.max(max, val);
          }
          System.out.print("Largest in given array is " + max);   
  }          
}

  Approach 
 -> We will traverse the array, and will keep a max variable that will be updated with the current element of the
    array if the array element is greater than the value of max variables
 -> Initially the max variable is given the minimum integer value.
 */     


 