class BankAccount {
    String account_holder_name;
    double balance;
    static double interest_rate = 10.0;
    BankAccount(String name, double bal) {
        account_holder_name = name;
        balance = bal;
    }
    double calculateInterest() {
        return (balance * interest_rate) / 100;
    }
    void display() {
        System.out.println("Name: " + account_holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + calculateInterest());
    }
    static void updateInterestRate(double rate) {
        interest_rate = rate;
    }
}
public class Main {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("Zeny", 10000);
        BankAccount a2 = new BankAccount("yug", 20000);
        a1.display();
        System.out.println();
        a2.display();
        System.out.println("\nUpdating Interest Rate...\n");
        BankAccount.updateInterestRate(7.0);
        a1.display();
        System.out.println();
        a2.display();
    }
}
