import java.util.Scanner;

class Account {
	int balance;

    // Method to set initial balance
    void setBalance(int b) {
        balance = b;
    }

    // Method to deposit money
    void deposit(int amount) {
        balance = balance + amount;
    }

    // Method to withdraw money
    void withdraw(int amount) {
        balance = balance - amount;
    }

    // Method to display balance
    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account acc = new Account();

        System.out.print("Enter Initial Balance: ");
        int initial = sc.nextInt();
        acc.setBalance(initial);

        System.out.print("Enter Deposit Amount: ");
        int deposit = sc.nextInt();
        acc.deposit(deposit);

        System.out.print("Enter Withdraw Amount: ");
        int withdraw = sc.nextInt();
        acc.withdraw(withdraw);

        acc.displayBalance();
    }
}