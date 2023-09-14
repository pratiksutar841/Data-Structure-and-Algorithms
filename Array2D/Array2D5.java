/*Q5: Write a function which accepts a 2D array of integers and its size as arguments and
displays the elements of middle row and the elements of middle column. Printing can
be done in any order.
[Assuming the 2D Array to be a square matrix with odd dimensions i.e. 3x3, 5x5, 7x7 etc...] 
Approach
w We have simply printed the elements when the value of row is fixed as “m/2” and when value of column is
fixed as “m/2”V
w Since the middle element i.e “arr[m/2][m/2]” will be repeated twice but we need to print it once so we simply
applied an if condition in the second for loop that if the value of column is also “m/2” then we can simply
continue over this element because it has been already counted in the row’s for loop.
Time complexity

O(m) where m = number of rows and for complete code if we consider than it is O(m*m) as

we are taking input in 2 for loops.
Space complexity
O(1)
*/

          import java.io.*;
          import java.util.*;
          public class Array2D5{ 
              public static void main(String args[]){
              
                  int m,n;
                  Scanner sc=new Scanner(System.in);
                  System.out.print("enter the number of rows : ");
                  m=sc.nextInt();    
                  
                  int arr[][]=new int[m][m];
                  
                  int i,j;    
                     
                  System.out.println("enter the  matrix element : ");    
                  for(i = 0 ; i < m ; i++){    
                      for(j = 0 ; j < m ; j++){    
                          arr[i][j]=sc.nextInt();  
                      }    
                  }  
                  
                  System.out.println("The elements  of the middle row and middle column are as follows : ");
                  
                   for(i = 0 ; i < m ; i++)System.out.print(arr[i][m/2] + "  ");    
                   for(j = 0 ; j < m ; j++){
                      if(j == m/2)continue;
                      System.out.print(arr[m/2][j] + "  ");
                  }
              }     
          }       
