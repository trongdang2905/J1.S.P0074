package gui;

import handle.DisplayMatrix;
import handle.GetValidInput;
import handle.MatrixCalculator;

public class Main {

    public static void main(String[] args) {

        MatrixCalculator calculator = new MatrixCalculator();

        int choice;

        do {
            //Step 1: Display menu and ask user to select option
            choice = calculator.displayAndAskUser();
            switch (choice) {
                //Step 2: Addition matrixes
                case 1:
                    calculator.additionMatrix();
                    break;
                //Step 3: Substraction matrixes
                case 2:
                    calculator.substractionMatrix();
                    break;
                //Step 4: Multiplication matries
                case 3:
                    calculator.multiplicationMatrix();
                    break;
                //Step 5: Exit program
                case 4:
                    break;
            }

        } while (choice != 4);

    }
}
