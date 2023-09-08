package Data_Structure_and_Algorithms.Array;
// Linear search
//time complexity: O(n)
//space complexity: O(1)

import java.util.*;
public class Array3 
{
          public static int LinearSearch(int numbers[], int key)
          {
            for (int i = 0; i < numbers.length; i++) 
            {
                    if (numbers[i]==key) 
                    {
                       return i;       
                    }
            }
            return -1;
          }
   public static void main(String[] args) 
   {
          int number[] = { 2, 4, 6, 8, 10, 12, 14, 16 }; 
          int key = 169;    
         
          int index=LinearSearch(number,key);

          if (index==-1) 
          {
                    System.out.println(" key is not found");
          }
          else 
          {
             System.out.println("key is at index : "+index);         
          }
   }         
}
