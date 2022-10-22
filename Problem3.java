package GitHub;

import java.util.Scanner;

public class Problem3 {
	public static void main (String[] args)
	   {
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a value: ");
	      int a=sc.nextInt();

	         if(a==1)
	         {
	             System.out.println(a);
	         }
	         else if(a==2)
	         {
	             a=a+2;
	             System.out.println(a+1);
	         }
	         else if(a%2!=0)
	         {
	             a=a+4;
	             for(int j=1;j<=a;j++)
	             {
	                 if(j%2!=0) 
	                 {
	                     System.out.print(j);
	                 }
	             }
	         }
	     }
	}

