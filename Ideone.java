/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int a, b,x,flag=0,i,j;
       a= sc.nextInt();
       b= sc.nextInt();
       for (i=a; i <= b; i++ ){
       for (j=2; j<i; j++){
        x= i%j;
        if (x==0){
         break;  
        }
       }
      if(i == j){
       flag=1;
       System.out.print(" "+i);
      }
     }
     if(flag==0)
     {
      System.out.print("No prime found ");
     }
	}
}
