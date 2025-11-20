import java.util.Scanner;
import utils.InputValidator;

public class ATM {
    private Account account;
    private Scanner sc = new Scanner(System.in);

    public ATM(Account account) {
        this.account = account;
    }

    public void showMenu() {
        System.out.println("====== ATM MENU ======");
        System.out.println("1. Withdraw Money");
        System.out.println("2. Deposit Money");
        System.out.println("3. Check Balance");
        System.out.println("4. Transaction History");
        System.out.println("5. EXIT");
        System.out.print("Choose an option: ");
    }

    public boolean login() {
        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Enter PIN: ");
            int entered = sc.nextInt();

            if (account.validatePIN(entered)) {
                System.out.println("Login Successful!\n");
                return true;
            } else {
                attempts--;
                System.out.println("Incorrect PIN. Attempts left: " + attempts);
            }
        }
        return false;
    }

    public void start() {
        if (!login()) {
            System.out.println("Too many failed attempts. Exiting.");
            return;
        }

        while (true) {
            showMenu();
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    withdraw();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    showHistory();
                    break;
                case 5:
                    System.out.println("Thank you for using the ATM!");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    private void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        int amount = sc.nextInt();

        if (!InputValidator.isPositiveAmount(amount)) {
            System.out.println("Invalid amount.");
            return;
        }

        if (account.withdraw(amount)) {
            System.out.println("Please collect your cash.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    private void deposit() {
        System.out.print("Enter amount to deposit: ");
        int amount = sc.nextInt();

        if (!InputValidator.isPositiveAmount(amount)) {
            System.out.println("Invalid amount.");
            return;
        }

        account.deposit(amount);
        System.out.println("Deposit successful.");
    }

    private void checkBalance() {
        System.out.println("Current Balance: ₹" + account.getBalance());
    }

    private void showHistory() {
        System.out.println("\n------ Transaction History ------");
        if (account.getHistory().isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (String entry : account.getHistory()) {
                System.out.println(entry);
            }
        }
        System.out.println("---------------------------------\n");
    }
}
