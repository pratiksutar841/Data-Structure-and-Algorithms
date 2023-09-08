package Data_Structure_and_Algorithms.Array;
//Max Subarray sum
public class Array9 
{
          public static void maxSubarrays(int numbers[])
          {
                    int currsum=0;
                    int maxsum=Integer.MIN_VALUE;
                  int ts =0;
                    for (int i = 0; i < numbers.length; i++) 
                    {
                      int start =i;
                      for (int j = i; j < numbers.length; j++) 
                      {
                        int end =j;
                        currsum =0;
                        for (int k = i; k <=end; k++) 
                        {
                          currsum+=numbers[k];     
                        }   
                        System.out.println(currsum);
                        if (maxsum<currsum) {
                              maxsum=currsum;
                        } 
                          
                      }       
                     
                    }
                    System.out.println("Max subarray = "+maxsum);
          }
 public static void main(String[] args) {
          int numbers[]={2,4,6,8,10};
          maxSubarrays(numbers);   
 }          
}
