/*Q2: write a program to print the elements above the secondary diagonal in a user inputted
square matrix.
Input 1: 1 2 3
         4 5 6
         7 8 9

Output : 1 2 4
U The secondary diagonal is highlighted>
U The ele?ents that lie above the secondary diagonal are also highlighted>
U In all these blue cells one thing is co??on>
U The su? of (i + j)th coordinate is always lesser than the colu?n nu?ber - 1>
U 0 + 0 < 3 , 0 + 1 < 3 , 0 + 2 < 3 , 1 + 0 < 3 and so on>
U We have used this condition to print all those ele?ents.
Time complexity: O(n*n) where n = nu?ber of rows
Space complexity: O(1)
*/
import java.io.*;
import java.util.*;
public class Array2D2
{ 
  public static void main(String args[])
  {
    
    int m,n;
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the number of rows : ");
    m=sc.nextInt();    
    System.out.print("enter the number of column : ");    
    n=sc.nextInt();
    int arr[][]=new int[m][n];
    
    int i,j;    
       
    System.out.println("enter the  matrix element : ");    
    for(i = 0 ; i < m ; i++){    
        for(j = 0 ; j < n ; j++){    
            arr[i][j]=sc.nextInt();  
        }    
    }     
    
    System.out.println("Elements above secondary diagonal are as follows : ");    
    for(i = 0 ; i < m ; i++){    
        for(j = 0 ; j < n ; j++){    
            if(i + j < m - 1)System.out.print(arr[i][j] + "  ");
            }    
        }  
    }     
}