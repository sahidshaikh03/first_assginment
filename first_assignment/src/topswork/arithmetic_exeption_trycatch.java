package topswork;

import java.util.Scanner;

public class arithmetic_exeption_trycatch {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter two numbers: ");
	        int num1 = sc.nextInt();
	        int num2 = sc.nextInt();
	        
	        try {
	            int result = num1 / num2;
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Cannot divide by zero!");
	        }
	    
	    }
	}

	


