import java.util.*;

class ATM {
    private int balance;
    private final int pin = 1234;     // default PIN
    private ArrayList<String> history;

    public ATM() {
        balance = 100000;
        history = new ArrayList<>();
    }

    public boolean validateAmount(int amount) {
        return amount > 0;
    }

    public boolean authenticate(Scanner sc) {
        int attempts = 3;
        while (attempts > 0) {
            System.out.print("Enter your PIN: ");
            int entered = sc.nextInt();

            if (entered == pin) {
                System.out.println("Login Successful!\n");
                return true;
            } else {
                attempts--;
                System.out.println("Incorrect PIN. Attempts left: " + attempts);
            }
        }
        return false;
    }

    public void withdraw(int amount) {
        if (!validateAmount(amount)) {
            System.out.println("Enter valid amount (greater than zero).");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance!");
            return;
        }

        balance -= amount;
        history.add("Withdrawn: ₹" + amount);
        System.out.println("Please collect your cash.");
    }

    public void deposit(int amount) {
        if (!validateAmount(amount)) {
            System.out.println("Enter valid amount (greater than zero).");
            return;
        }

        balance += amount;
        history.add("Deposited: ₹" + amount);
        System.out.println("Deposit successful!");
    }

    public void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    public void showHistory() {
        System.out.println("\n----- Transaction History -----");
        if (history.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (String entry : history) {
                System.out.println(entry);
            }
        }
        System.out.println("-------------------------------\n");
    }
}

public class atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();

        // Authenticate user first
        if (!atm.authenticate(sc)) {
            System.out.println("Too many incorrect attempts. Exiting.");
            System.exit(0);
        }

        while (true) {
            System.out.println("====== ATM MENU ======");
            System.out.println("1. Withdraw Money");
            System.out.println("2. Deposit Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Transaction History");
            System.out.println("5. EXIT");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    atm.withdraw(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    atm.deposit(sc.nextInt());
                    break;

                case 3:
                    atm.checkBalance();
                    break;

                case 4:
                    atm.showHistory();
                    break;

                case 5:
                    System.out.println("Thank you for using ATM!");
                    System.exit(0);

                default:
                    System.out.println("Invalid option! Try again.");
            }
            System.out.println();
        }
    }
}
