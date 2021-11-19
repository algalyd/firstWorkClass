import java.util.Arrays;
import java.util.Scanner;

public class secondLargestNumber {
    public static void main(String[] args) {
        int i;
        Scanner arrayInputs = new Scanner(System.in);
        int[] arrayNumbersInputs = new int[arrayInputs.nextInt()];

        for(i = 0; i < arrayNumbersInputs.length; i++)
            arrayNumbersInputs[i] = arrayInputs.nextInt();
        secondLargestNumberReturn(arrayNumbersInputs);
    }

    public static int secondLargestNumberReturn(int[] arrayNumbersInputs){
        int secondLargestNumber;

        Arrays.sort(arrayNumbersInputs);
        secondLargestNumber = arrayNumbersInputs[arrayNumbersInputs.length-2];

        return secondLargestNumber;
    }
}
