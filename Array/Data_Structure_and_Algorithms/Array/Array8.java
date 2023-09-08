package Data_Structure_and_Algorithms.Array;
// Print Subarrays
public class Array8 
{
          public static void printSubarrays(int numbers[])
          {
                  int ts =0;
                    for (int i = 0; i < numbers.length; i++) 
                    {
                      int start =i;
                      for (int j = i; j < numbers.length; j++) 
                      {
                        int end =j;
                        for (int k = i; k <=end; k++) 
                        {
                          System.out.print(numbers[k]+" ");      
                        }    
                        ts++;
                        System.out.println();    
                      }       
                      System.out.println();
                    }
                    System.out.println("Total subarrays = "+ts);
          }
 public static void main(String[] args) 
 {
   int numbers[]={2,4,6,8,10};
   printSubarrays(numbers);

 }         
}
