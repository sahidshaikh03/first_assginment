package topswork;
import java.util.Scanner;
public class vowel_consonant {

	public static void main(String[] args) {
	


        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a single character: ");
        String input = sc.nextLine();

        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Error: Please enter a single letter.");
        } else {
            char c = Character.toLowerCase(input.charAt(0));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        }
	}

}
