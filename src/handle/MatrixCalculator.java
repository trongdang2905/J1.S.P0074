package handle;

public class MatrixCalculator {

    public int displayAndAskUser() {
        String[] options = {
            "Addition Matrix",
            "Substraction Matrix",
            "Multiplication Matrix",
            "Quit"
        };

        //Hien thi menu toi user
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
        int choice = GetValidInput.getInt("Your choice: ", 1, options.length);
        return choice;

    }

    public void additionMatrix() {
        DisplayMatrix display = new DisplayMatrix();
        System.out.println("-------- Addition --------");

        int[][] matrix1 = GetValidInput.getMatrix(1);
        int[][] matrix2 = GetValidInput.getMatrix(2);

        int row1 = matrix1.length, row2 = matrix2.length, column1 = matrix1[0].length, column2 = matrix2[0].length;
        //Kiem tra dieu kien can de 2 ma tran co the cong
        if ((row1 != row2) || (column1 != column2)) {
            System.out.println("Can not addition");
            return;
        }

        int[][] result = new int[row1][column1];
        // Cong 2 ma tran
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        display.displayMatrix(matrix1, matrix2, result, "+");

    }

    public void substractionMatrix() {
        DisplayMatrix display = new DisplayMatrix();
        System.out.println("-------- Substraction --------");

        int[][] matrix1 = GetValidInput.getMatrix(1);
        int[][] matrix2 = GetValidInput.getMatrix(2);

        int row1 = matrix1.length, row2 = matrix2.length, column1 = matrix1[0].length, column2 = matrix2[0].length;
        // Kiem tra dieu kien can de tru 2 ma tran
        if ((row1 != row2) || (column1 != column2)) {
            System.out.println("Can not substraction");
            return;
        }

        int[][] result = new int[row1][column1];
        //Tru 2 ma tran
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        display.displayMatrix(matrix1, matrix2, result, "-");

    }

    public void multiplicationMatrix() {
        DisplayMatrix display = new DisplayMatrix();
        System.out.println("-------- Multiplication --------");

        int[][] matrix1 = GetValidInput.getMatrix(1);
        int[][] matrix2 = GetValidInput.getMatrix(2);

        int row1 = matrix1.length;

        int row2 = matrix2.length;
        int column1 = matrix1[0].length;
        int column2 = matrix2[0].length;
        //Kiem tra dieu kien can de nhan 2 ma tran
        if (column1 != row2) {
            System.out.println("Can not muliplicate!");
            return;
        }

        int[][] tmpMatrix = new int[column2][row2];
        //Chuyen vi ma tran thu 2
        for (int i = 0; i < column2; i++) {
            for (int j = 0; j < row2; j++) {
                tmpMatrix[i][j] = matrix2[j][i];
            }
        }

        int[][] result = new int[row1][column2];
        // Nhan ma tran 1 voi ma tran chuyen vi
        for (int i = 0; i < row1; i++) {
            
            for (int j = 0; j < column2; j++) {
                int sum = 0;
                for (int k = 0; k < column1; k++) {
                    // matrix1[i][k]: phần tử thứ k của hàng i trong matrix1
                    // tmpMatrix[j][k]: phần tử thứ k của hàng j trong tmpMatrix (tức là cột j của matrix2 gốc)
                    sum += matrix1[i][k] * tmpMatrix[j][k];
                }
                result[i][j] = sum;
            }

        }

        display.displayMatrix(matrix1, matrix2, result, "*");

    }

}
