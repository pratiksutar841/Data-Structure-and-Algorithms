//Duplicate of Array
//time complexity: O(n)
//space complexity: O(1)
public class Array10 {
          public class Duplicate_Array 
          {
              public static void main(String[] args)
              {
                  int[] arr = {2, 3, 3, 6, 6, 9};
                  int n = arr.length;
          
                  for(int i=0; i<n; i++)
                  {
                      for(int j=i+1; j<n; j++)
                      {
                          if(arr[i] == arr[j])
                          {
                              System.out.println("Duplicate Elements found is:"+arr[i]);
                          }
                      }
                  }
              }
          }   
}
