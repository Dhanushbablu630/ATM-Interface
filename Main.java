public class Main {
    public static void main(String[] args) {

        // Create account with PIN = 1234 & starting balance = ₹100000
        Account account = new Account(1234, 100000);

        ATM atm = new ATM(account);

        atm.start();
    }
}
