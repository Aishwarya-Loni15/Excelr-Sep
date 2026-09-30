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
	      r