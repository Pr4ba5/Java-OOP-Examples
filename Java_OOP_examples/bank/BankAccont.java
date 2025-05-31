package Java_OOP_examples.bank;

import java.util.ArrayList;

public class BankAccont {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    ArrayList<String> log = new ArrayList<>();

    public BankAccont(String accountNumber, String accountHolder, double balance){
        this.accountHolder= accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void Deposit(double amount) throws InvalidAmountException{
        if(amount <= 0){
            throw new InvalidAmountException();
        }

        else{
            System.out.println("Successfully deposited $ "+ amount+" into your account");
            balance += amount;
            log.add(amount + " Deposited into "+ accountNumber);
        }
    }

    public void withdraw(double amount) throws InsufficientFundException, InvalidAmountException{
        if (amount >= balance) {
            throw new InsufficientFundException();
        }

        
        else if(amount <= 0 ){
            throw new InvalidAmountException();
        }

        else{
            System.out.println("$ "+amount+" has been successfully withdrawl from your account.");
            balance -= amount;
            log.add(amount + " has been withdrawl from "+ accountNumber + " holder name: "+ accountHolder);
        }
    }

    public void printInvoice(){
        for (String logs: log){
            System.out.println(logs);
        }
    }
}