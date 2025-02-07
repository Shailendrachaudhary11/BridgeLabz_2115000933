// Superclass: BankAccount
class BankAccount {
    protected String accountNumber;
    protected double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display account details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber + ", Balance: $" + balance);
    }

    // Abstract method to be implemented by subclasses
    public void displayAccountType() {
        System.out.println("General Bank Account");
    }
}

// Subclass: SavingsAccount (Extends BankAccount)
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Overriding displayAccountType()
    @Override
    public void displayAccountType() {
        System.out.println("Savings Account (Interest Rate: " + interestRate + "%)");
    }
}

// Subclass: CheckingAccount (Extends BankAccount)
class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    // Constructor
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    // Overriding displayAccountType()
    @Override
    public void displayAccountType() {
        System.out.println("Checking Account (Withdrawal Limit: $" + withdrawalLimit + " per day)");
    }
}

// Subclass: FixedDepositAccount (Extends BankAccount)
class FixedDepositAccount extends BankAccount {
    private int maturityPeriod; // in months

    // Constructor
    public FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    // Overriding displayAccountType()
    @Override
    public void displayAccountType() {
        System.out.println("Fixed Deposit Account (Maturity Period: " + maturityPeriod + " months)");
    }
}

// Main class to demonstrate hierarchical inheritance
public class BankSystem {
    public static void main(String[] args) {
        // Creating different bank account instances
        SavingsAccount savings = new SavingsAccount("SA12345", 5000, 3.5);
        CheckingAccount checking = new CheckingAccount("CA67890", 2000, 1000);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD11223", 10000, 12);

        // Displaying account details
        savings.displayDetails();
        savings.displayAccountType();

        checking.displayDetails();
        checking.displayAccountType();

        fixedDeposit.displayDetails();
        fixedDeposit.displayAccountType();
    }
}
