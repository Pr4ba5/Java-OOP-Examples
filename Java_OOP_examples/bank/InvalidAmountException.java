package Java_OOP_examples.bank;

public class InvalidAmountException extends Exception{
    public InvalidAmountException(){
        super("Amount cannot be zero or negative.");
    }
}
