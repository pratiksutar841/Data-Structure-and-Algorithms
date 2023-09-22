//Amazon
//1] Push at the bottom of the stack
package Data_Structure_and_Algorithms.Stack;
import java.util.*;

import Data_Structure_and_Algorithms.Stack.Stack1.stack;
public class Stack4 
{
          public static void pushAtBottom(Stack<Integer>s,int data)
          {
            if(s.isEmpty())
            {
                    s.push(data);
                    return;
            }
            int top =s.pop();
            pushAtBottom(s, data);
            s.push(top);
          }
      public static void main(String[] args) 
          {
                    Stack<Integer>s=new Stack<>();
                    s.push(1);
                    s.push(2);
                    s.push(3);
                    s.push(4);
                    s.push(5);
                    s.push(6);
                    pushAtBottom(s,10);
                    while (!s.isEmpty()) {
                          System.out.println(s.pop());    
                    }
          }
}
