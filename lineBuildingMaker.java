import java.util.Scanner;

public class lineBuildingMaker {

    public static void main(String[] args) {
        int buildingLineLength;
        int buildingLineHeight;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter building line length: ");
        buildingLineLength = input.nextInt();

        System.out.print("Please enter building line height: ");
        buildingLineHeight = input.nextInt();

        lineBuilderPrinter(buildingLineLength, buildingLineHeight);
    }

    public static void lineBuilderPrinter(int buildingLineLength, int buildingLineHeight){
        int i;
        String lineBase = "";

        for (i = 0; i < buildingLineLength; i++){
            lineBase = lineBase + "-";
        }

        for (i = 0; i < buildingLineHeight; i++) {
            System.out.println(lineBase);
        }
    }
}
