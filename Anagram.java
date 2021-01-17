/*
 * Activity 2.4.3
 */
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = sc.nextLine();
        System.out.println("enter second string: ");
        String input2 = sc.nextLine();

        input = input.replace(" ", "");
        input2 = input2.replace(" ", "");

        if (input.length() == input2.length()) {
            for (int k = 0; k < input.length(); k++) {
                if (input2.contains(input.substring(k, k + 1))) {
                    input2 = input2.replaceFirst(input.substring(k, k + 1), "");
                    if (input2.equals("")) {
                        System.out.println("it is an anagram");
                    } 
                } else {
                    System.out.println("it is not an anagram");
                    break;
                }
            }
        } else {   
        System.out.println("it is not an anagram");
    }

}
}