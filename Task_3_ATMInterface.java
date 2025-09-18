


import java.util.*;

class BankAccount{
    private double balance;

    
    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }

    
    public void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("deposited ₹" + amount);
        }else{
            System.out.println("Enter valid amount to deposit.");
        }
    }

    
    public void withdraw(double amount){
        if (amount <= 0){
            System.out.println("Enter valid amount .");
        }else if(amount > balance){
            System.out.println("Insufficient balance.");
        }else{
            balance -= amount;
            System.out.println("withdrawn " + amount);
        }
    }

    
    public void checkBalance(){
        System.out.println("Current Balance: " + balance);
    }
}


class ATM{
    private BankAccount account;
    private Scanner sc = new Scanner(System.in);

    
    public ATM(BankAccount account){
        this.account = account;
    }

    
    public void showMenu(){
        while(true){
            System.out.println("\n ATM menu");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print(" Enter your choice: ");

            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    account.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ₹");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ₹");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    return; 
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}


public class Task_3_ATMInterface{
    public static void main(String[] args){
        BankAccount account = new BankAccount(5000); 
        ATM atm = new ATM(account);
        atm.showMenu(); 
    }
}
