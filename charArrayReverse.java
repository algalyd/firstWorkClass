

import java.util.Scanner;

public class charArrayReverse {
    public static void main(String[] args) {
        int charIndex;
        int i;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter char array length: ");
        charIndex = scanner.nextInt();

        char[] charArrayInput = new char[charIndex];
        for (i = 0; i < charArrayInput.length; i++) {
            charArrayInput[i] = scanner.next().charAt(0);
        }

        charArrayReversePrinter(charArrayInput);
    }


    public static char[] charArrayReversePrinter(char[] charArrayInput) {
        int c;
        int m = 0;
        int charArrayInputLength = charArrayInput.length;
        char[] charArrayInputReversed = new char[charArrayInputLength];

        for (c = charArrayInputLength ;c > 0 ; c--){


            charArrayInputReversed[m] = charArrayInput[c-1];
            m = m + 1;
        }
        return charArrayInputReversed;
    }
}
