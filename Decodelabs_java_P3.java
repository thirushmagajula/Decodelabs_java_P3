import java.util.Scanner;

// Bank Account class
class BankAccount {
    private int accountNumber;
    private int pin;
    private double balance;

    // Constructor
    BankAccount(int accountNumber, int pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    // Login validation
    boolean login(int enteredAccount, int enteredPin) {
        return accountNumber == enteredAccount && pin == enteredPin;
    }

    // Deposit method
    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited successfully.");
            System.out.println("New balance: Rs." + balance);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance = balance - amount;
            System.out.println("Please collect your cash.");
            System.out.println("Remaining balance: Rs." + balance);
        }
    }

    // Balance check
    void checkBalance() {
        System.out.println("Available balance: Rs." + balance);
    }
}


// ATM class
class ATM {

    void start() {
        Scanner sc = new Scanner(System.in);

        // Sample account details
        BankAccount account = new BankAccount(12345, 1234, 10000);

        System.out.println("================================");
        System.out.println("       WELCOME TO ATM");
        System.out.println("================================");

        // Login
        System.out.print("Enter Account Number: ");
        int enteredAccount = sc.nextInt();

        System.out.print("Enter PIN: ");
        int enteredPin = sc.nextInt();

        if (!account.login(enteredAccount, enteredPin)) {
            System.out.println("Invalid account number or PIN.");
            System.out.println("Login failed.");
            return;
        }

        System.out.println("\nLogin successful!");
        System.out.println("Welcome to your account.");

        int choice;

        do {
            System.out.println("\n========== ATM MENU ==========");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("==============================");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    account.checkBalance();
                    break;

                case 2:
                    System.out.print("Enter deposit amount: Rs.");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: Rs.");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}


// Main class
public class Decodelabs_java_P3 {
    public static void main(String[] args) {

        ATM atm = new ATM();
        atm.start();

    }
}