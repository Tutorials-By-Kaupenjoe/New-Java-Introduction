package kaupenjoe;

public interface Operation {
    int perform(int firstNumber, int secondNumber);

    char getOperationSymbol();
}