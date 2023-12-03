package kaupenjoe;

public class Calculator {
    private Operation operation;
    private int firstNumber;
    private int secondNumber;

    public Calculator(Operation operation) {
        this.operation = operation;
    }

    public int calculate(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        return operation.perform(firstNumber, secondNumber);
    }

    public String getOperationString() {
        return firstNumber + " " + operation.getOperationSymbol() + " " + secondNumber;
    }
}