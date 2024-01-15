package Codesoft;

import java.util.*;

class ATM {
    private BankAccount userAccount;

    public ATM(BankAccount userAccount) {
        this.userAccount = userAccount;
    }
    public void bankoperation(int number) {
        Scanner sc = new Scanner(System.in);
        if (number == 1) {
            System.out.print("Enter withdrawal amount: ");
            double withdrawAmount = sc.nextDouble();
            if (userAccount.withdraw(withdrawAmount)) {
                System.out.println("Withdrawal completed. Remaining balance: " + userAccount.getBalance());
            } else {
                System.out.println("Insufficient funds.");
            }
        } else if (number == 2) {
            System.out.print("Enter deposit amount: ");
            double depositAmount = sc.nextDouble();
            userAccount.deposit(depositAmount);
            System.out.println("Deposit completed. New balance: " + userAccount.getBalance());
        } else if (number == 3) {
            System.out.println("Current balance: " + userAccount.getBalance());
        } 
    }
}


class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance =balance+ amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance = balance-amount;
            return true;
        } else {
            return false;
        }
    }
}

public class Atmbank {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(3000);
        ATM atm = new ATM(userAccount);
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("ATM Menu:");
            System.out.println("1. Withdraw ");
            System.out.println("2. Deposit ");
            System.out.println("3. Check Balance ");
            System.out.println("4. Exit ");
            System.out.print("choose an number : ");
            int number = sc.nextInt();
            if(number==4) {
            	 System.out.println("Thank you!");
                 break;
            }
            atm.bankoperation(number);
        }
    }
}

