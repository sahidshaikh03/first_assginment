package topswork;

import java.util.Scanner;

public class Divisable_by_3_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the value of i : ");
        for (int i = 0; i <= 100; i++) {
        	i=sc.nextInt();
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " is divisible by both 3 and 5");
            } else if (i % 3 == 0) {
                System.out.println(i + " is divisible by 3");
            } else if (i % 5 == 0) {
                System.out.println(i + " is divisible by 5");
            }
      }

	}

}
