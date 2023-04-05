package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramFibonacci {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter the number of sequence numbers: ");
        int n = sc.nextInt();

        int front = 1;
        int behind = 0;
        int cont = 0;

        System.out.print("Enter a number for compare: ");
        int number = sc.nextInt();

        for(int i = 0; i<n; i++){

            front += behind;
            behind = front - behind;

            System.out.print(front + ", ");

            if (number == front) {
                cont = 1;
            }
        }

        if (cont == 1){
            System.out.println("\nNumber " + number + " Belongs!");
        }else{
            System.out.println("\nNumber " + number + " does not belong");
        }

        sc.close();
    }
}
