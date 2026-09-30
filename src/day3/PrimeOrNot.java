package day3;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number");
       int num =sc.nextInt();
       int count=0;
       for(int i=1;i<=num;i=i+1) {
    	   if(num%i==0) {
    		  count++;
    	   }
       }
    	  if(count==2) {
    		  System.out.println("Number is Prime");
       }
    	  else {
    		  System.out.println("number is not prime");
    	  }
    	  
	}

}
