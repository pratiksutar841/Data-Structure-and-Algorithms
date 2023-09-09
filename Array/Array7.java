//PAirs in An Array   2,4,6,8,10
// (2,4)(2,6)(2,8)(2,10)
// (4,6)(4,8)(4,10)          tp=n(n-1)/2
// (6,8)(6,10)
// (8,10)

//time complexity: O(n^2)
//space complexity: O(1)
public class Array7 
{
     public static void printPairs(int number[])
       {
          int tp=0;
          for (int i = 0; i < number.length; i++) 
          {
                    int curr=number[i];
                    for (int j = i+1; j < number.length; j++) 
                    {
                      System.out.print("("+curr+","+number[j]+")");  
                      tp++;
                    }
                 System.out.println();
           }      
           System.out.println("Total pairs = "+tp);
        }
  public static void main(String[] args) 
  {
    int number[]={2,4,6,8,10};
    printPairs(number);

  }          
}
