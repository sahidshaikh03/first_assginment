package topswork;

import java.util.Scanner;

public class age_validate {
//public static void main(String[] args) {
//	int validate_age;
//	Scanner sc=new Scanner(System.in);
//	System.out.println("the validate age is : ");
//	validate_age=sc.nextInt();
//	try {
//		if (validate_age>=18) {
//			System.out.println("Welcome to vote!");
//		}
////		else {
////			System.out.println("your age is not validate to vote..sorry");
////		}
//		
//	} catch (Exception e) {
//		// TODO: handle exception
//		System.out.println(e.getMessage());
//	}
//}
	
	
//	public class AgeValidator {

	    public static void validate(int age) throws ArithmeticException {
	        if (age < 18) {
	            throw new ArithmeticException("You are not eligible to vote.");
	        } else {
	            System.out.println("Welcome to vote.");
	        }
	    }

	    public static void main(String[] args) {
	        try {
	            validate(16);
	        } catch (ArithmeticException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}

//}
