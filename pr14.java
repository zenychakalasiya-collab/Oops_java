class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;
    void openAccount(int accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = bal;
    }
    void deposit(double amount) {
        balance += amount;
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
    void checkBalance() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}
class SavingAccount extends BankAccount {
    double calculateInterest(double rate) {
        return balance * rate / 100;
    }
}
class FixedDepositAccount extends BankAccount {
    double maturityAmount(double rate, int years) {
        return balance * Math.pow((1 + rate / 100), years);
    }
}
public class Main {
    public static void main(String[] args) {
        SavingAccount s = new SavingAccount();
        s.openAccount(101, "Zeny", 10000);
        s.deposit(2000);
        s.withdraw(1500);
        s.checkBalance();
        System.out.println("Interest = " + s.calculateInterest(5));
        System.out.println();
        FixedDepositAccount f = new FixedDepositAccount();
        f.openAccount(102, "Yug", 20000);
        f.checkBalance();
        System.out.println("Maturity Amount = " + f.maturityAmount(7, 2));
    }
}
