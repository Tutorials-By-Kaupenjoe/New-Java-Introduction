package kaupenjoe;

public class Multiplication implements Operation {
    @Override
    public int perform(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    @Override
    public char getOperationSymbol() {
        return '*';
    }
}