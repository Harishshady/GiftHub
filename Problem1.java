package GitHub;

import java.util.Scanner;

public class Problem1 {
	   private static Scanner reader;

	public static void main (String[] args)
	   {
	      double num1;
	      double num2;
	      double ans;
	      char op;
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter two numbers: ");
	      int n=sc.nextInt();
	      num1= reader.nextDouble();
	      num2= reader.nextDouble();
	      System.out.println("Enter an operator(+,-,*,/): ");
	      op= reader.next().charAt(0);
	      switch(op)
	      {
	         case'+': ans=num1+num2;
	         break;
	         case'-': ans=num1-num2;
	         break;
	         case'*': ans=num1*num2;
	         break;
	         case'/': ans=num1/num2;
	         break;
	      default:System.out.println("Error! Enter correct operator");
	      return;
	      }
	       System.out.println("The result is given as follows: ");
	       System.out.println(num1 + " "+ op + " "+ num2+ "="+ ans);
	   }
	}


