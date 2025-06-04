package handle;

import java.util.Scanner;

public class GetValidInput {

    private static Scanner sc = new Scanner(System.in);

    public static int getInt(String msg, int min, int max) {
        //Vong lap lay gia tri so nguyen hop le trong khoang min - max
        while (true) {
            try {
                System.out.print(msg);
                int n = Integer.parseInt(sc.nextLine());
                // Kiem tra dieu kien trong khoang min - max
                if (n >= min && n <= max) {
                    return n;
                }
                System.out.println("Please input number in range " + min + " - " + max);
            } catch (NumberFormatException e) {
                System.out.println("Please input a number");
            }

        }
    }

    public static int[][] getMatrix(int numberOfMatrix) {

        int row = getInt("Enter Row Matrix " + numberOfMatrix +":", 0, 100);

        int column = getInt("Enter Column Matrix " + numberOfMatrix +":", 0, 100);

        int[][] matrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                try {

                    matrix[i][j] = getNumberOfMatrix("Enter Matrix" + numberOfMatrix + "[" + (i + 1) + "]" + "[" + (j + 1) + "]:");
                } catch (NumberFormatException e) {
                    System.out.println("Value of matrix is digit");
                }
            }
        }
        return matrix;
    }

    public static int getNumberOfMatrix(String msg) {
        // Vong lap lay gia tri so nguyen
        while (true) {
            try {
                System.out.print(msg);
                int n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (NumberFormatException e) {
                System.out.println("Values of matrix must be the number");
            }
        }
    }
}
