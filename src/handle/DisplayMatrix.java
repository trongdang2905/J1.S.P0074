package handle;

public class DisplayMatrix {

    public void displayMatrix(int[][] matrix1, int[][] matrix2, int[][] result, String operator) {

        System.out.println("-------- Result --------");
        for (int[] matrix : matrix1) {
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.print("[" + matrix[j] + "]");
            }
            System.out.println();
        }
        System.out.println(operator);
        for (int[] matrix : matrix2) {
            for (int j = 0; j < matrix2[0].length; j++) {
                System.out.print("[" + matrix[j] + "]");
            }
            System.out.println();
        }
        System.out.println("=");
        for (int[] result1 : result) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print("[" + result1[j] + "]");
            }
            System.out.println();
        }
    }
}
