import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bank bank = new Bank();
        
        System.out.println(" Welcome to the Bank ");
        
        System.out.print("Enter account number: ");
        int accNum = input.nextInt();
        
        System.out.print("Enter pin");
        int pin = input.nextInt();
        
        BankAccount account = bank.findAccount(accNum,pin);
        
        if (account !=null) {
            System.out.println("Welcome, " + account.getName() + "!");
            bank.performTransaction(account);
        } else { 
            System.out.println("Invalid account number or PIN.");
        }
    }
}