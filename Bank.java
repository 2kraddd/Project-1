import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private ArrayList<BankAccount> accounts = new ArrayList<>();
    private Scanner input = new Scanner(System.in);
    
    public Bank() {
        accounts.add(new BankAccount(1001, 1234, "John Doe", 500.00));
        accounts.add(new BankAccount(1002, 2345, "Jane Smith", 1200.00));
        accounts.add(new BankAccount(1003, 3456, "Alice Johnson", 850.00));
    }
    
    public BankAccount findAccount(int accountNumber, int pin) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber() == accountNumber && acc.validatePin(pin)) {
                return acc;
            }
        }
        return null;
    }
    
    public void performTransaction(BankAccount account) {
        int choice;
        
        do { 
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("Choose an option: ");
            
            choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    account.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = input.nextDouble();
                    account.deposit(deposit);
                    break;
                case 3: 
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = input.nextDouble();
                    account.withdraw(withdraw);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option");
                
            }
        } while (choice != 4);
    }
}