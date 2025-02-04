// Create a BankAccount class with the following features:
// Static:
// A static variable bankName shared across all accounts.
// A static method getTotalAccounts() to display the total number of accounts.
// This:
// Use this to resolve ambiguity in the constructor when initializing accountHolderName and accountNumber.
// Final:
// Use a final variable accountNumber to ensure it cannot be changed once assigned.
// Instanceof:
// Check if an account object is an instance of the BankAccount class before displaying its details.

class BankAccount{
    static String bankName = "ABC Bank";
    static int totalAccounts = 0;
    String accountHolderName;
    final int accountNumber;

    public BankAccount(String accountHolderName, int accountNumber){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }
    public static void getTotalAccounts(){
        System.out.println("Total number of accounts are: "+totalAccounts);
    }
    public void displayDetails(){
        if(this instanceof BankAccount){
            System.out.println("The bank name is: "+bankName);
            System.out.println("The account holder name is: "+accountHolderName);
            System.out.println("The account number is: "+accountNumber);
        }
    }
}

public class BankAccountSystem{
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Rio", 1043);
        BankAccount account2 = new BankAccount("Charlie", 1048);
        System.out.println("----------Bank Account 1 details-----------");
        account1.displayDetails();
        System.out.println("----------Bank Account 2 details-----------");
        account2.displayDetails();
        BankAccount.getTotalAccounts();

    }
}