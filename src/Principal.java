import Entities.Account;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account data: ");

        System.out.print("Number: ");
        Integer numAccount = scanner.nextInt();


        System.out.print("Holder: ");
        String holder = scanner.next();

        scanner.nextLine();
        System.out.print("Initial balance: ");
        Double balance = scanner.nextDouble();

        System.out.print("Withdraw Limit: ");
        Double limit = scanner.nextDouble();

        Account account = new Account(numAccount,  holder, balance, limit);

        System.out.println("");
        System.out.println("Enter amount for witdraw: ");
        Double amount = scanner.nextDouble();
        account.withdraw(amount);

        System.out.println("New Balance: " + account.getBalance());
}
}