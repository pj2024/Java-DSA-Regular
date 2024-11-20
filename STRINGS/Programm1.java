package STRINGS;

import java.util.Scanner;

public class Programm1 {
    // Question 1 : Count how many times lowercase vowels occurred in a String entered by the
    // user.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string here: ");
        String str = sc.nextLine();
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("The number of lowercase vowels in the string are : " + count);
        
    }
    
}