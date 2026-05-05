public class BankAccount {
    private int accountNumber;
    private int pin;
    private String name;
    private double currentBalance;
    
    public BankAccount(int accountNumber, int pin, String name, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.name = name;
        this.currentBalance = balance;
    }
    
    public boolean validatePin(int inputPin) {
        return this.pin == inputPin;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            currentBalance += amount; 
            System.out.println("Deposit Successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > currentBalance) {
            System.out.println("Insufficient funds.");
        } else {
            currentBalance -= amount;
            System.out.println("Withdrawal successful.");
        }
    }
    
    public void checkBalance() {
        System.out.printf("Current balance: $%.2f%n", currentBalance);
    }
    
    public int getAccountNumber() {
        return accountNumber;
    }
    
    public String getName() {
        return name;
    }
}