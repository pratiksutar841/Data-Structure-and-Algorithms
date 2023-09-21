//impliment by using java framework

package Data_Structure_and_Algorithms.Stack;
import java.util.*;
public class Stack3 
{
  public static void main(String[] args) 
  {
    Stack<Integer>s=new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    s.push(6);

    while (!s.isEmpty()) {
          System.out.println(s.peek());
          s.pop();
    }
  }

}
