////amazon, microsoft
//2] Reverse a string using a stack
package Data_Structure_and_Algorithms.Stack;

import java.util.Stack;

public class Stack5 
{
    public static String reverseString(String str)
          {
            Stack<Character>s=new Stack<>();
            int idx=0;
            while (idx<str.length()) 
            {
             s.push(str.charAt(idx));
             idx++;        
            }
            StringBuilder result = new StringBuilder(" ");
            while (!s.isEmpty()) 
            {
             char curr =s.pop();
             result.append(curr);  
            }
            return result.toString();
          }
  public static void main(String[] args) 
  {
     String str="abcd";
     String result = reverseString(str);
     System.out.print(result);      
  }          
}
