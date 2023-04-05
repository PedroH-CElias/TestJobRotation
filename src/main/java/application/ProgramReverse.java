package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramReverse {

    public static String reverse(String str){

        char[] vect = new char[str.length()];

        for (int i=0; i<str.length(); i++){
            vect[str.length() - i - 1] = str.charAt(i);
        }

        String reverse = String.copyValueOf(vect);

        return reverse;
    }

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter with a string: ");
        String str = sc.nextLine();

        System.out.println("String reverse: " + reverse(str));

        sc.close();
    }
}
