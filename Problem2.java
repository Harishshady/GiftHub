package GitHub;

import java.util.Scanner;

public class Problem2 {
	public static void main (String[] args)
	   {
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Input a= ");
	      int n=sc.nextInt();
	         
	         for(int i=1;i<=n+(n-1);i++)
	         {
	             if(i%2!=0)
	             {
	                 System.out.print(i+" ");
	              }
	         }
	   }
}


