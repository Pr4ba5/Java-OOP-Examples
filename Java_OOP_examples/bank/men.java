package Java_OOP_examples.bank;

import java.util.Scanner;

public class men {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      try {
        System.out.print("Enter balance: ");
        int balance = sc.nextInt();
        sc.nextLine();
        if (balance > 0) {
          BankAccont user1 = new BankAccont("037146667", "Prabas", balance);

          user1.Deposit(2000);
          user1.Deposit(1000);
          user1.withdraw(1000);
          System.out.println("Total amount: "+ user1.getBalance());
          user1.printInvoice();
          break;
        } else {
          System.out.println("Invalid amount.");
        }
      } catch (Exception e) {}
    }

    sc.close();
  }
}
