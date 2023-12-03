package kaupenjoe;

public class Division implements Operation {
    @Override
    public int perform(int firstNumber, int secondNumber) {
        if (secondNumber != 0) {
            return firstNumber / secondNumber;
        } else {
            System.out.println("Error: Division by zero");
            return Integer.MIN_VALUE; // Representing an error condition
        }
    }

    @Override
    public char getOperationSymbol() {
        return '/';
    }
}