package day3;

import java.util.Scanner;

public class DoWhileProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	      System.out.println("Enter Number 1");
	      int num1=sc.nextInt();
	      System.out.println("Enter Number 2");
	      int num2=sc.nextInt();
	      
	      int choice;
	      double result;
	      do {
	      System.out.println("Menu");
	      System.out.println("1. Addtion");
	      System.out.println("2. Subraction");
	      System.out.println("3. Division");
	      System.out.println("4. Multiplication");
	      System.out.println("0. Exit");
	      
	      System.out.println("Enter choice ");
	      choice=sc.nextInt();
	      result = 0.0;
	      switch(choice) {
	      case 1: result=num1+num2;break;
	      case 2: result=num1-num2;break;
	      case 3: result=num1/num2;break;
	      case 4: result=num1*num2;break;
	      case 0: System.exit(0);
	      default:System.out.println("invalid input");
	      }
	      System.out.println("result"+result);
	      }
	      
	      while(choice!=0);
	      
	      
	}

	}


