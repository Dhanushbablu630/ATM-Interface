import java.util.ArrayList;

public class Account {
    private int pin;
    private int balance;
    private ArrayList<String> history;

    public Account(int pin, int balance) {
        this.pin = pin;
        this.balance = balance;
        this.history = new ArrayList<>();
    }

    public boolean validatePIN(int enteredPIN) {
        return this.pin == enteredPIN;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
        history.add("Deposited: ₹" + amount);
    }

    public boolean withdraw(int amount) {
        if (amount > balance) {
            return false;
        }
        balance -= amount;
        history.add("Withdrawn: ₹" + amount);
        return true;
    }

    public ArrayList<String> getHistory() {
        return history;
    }
}
