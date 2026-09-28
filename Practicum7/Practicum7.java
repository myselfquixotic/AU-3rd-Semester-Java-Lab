package Practicum7;
import java.util.InputMismatchException;
import java.util.Scanner;
class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String message){
        super(message);
    }
}
class Account{
    String accountHolderName;
    double accountBalance;
    Account(String name,double balance){
        accountHolderName=name;
        accountBalance=balance;
    }
    void withdraw(double amount)throws InsufficientBalanceException{
        if(amount>accountBalance){
            throw new InsufficientBalanceException("Insufficient Balance");
        }else if(amount<0){
            throw new InsufficientBalanceException("Invalid Withdrawal Amount");
        }else{
            accountBalance-=amount;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: Rs."+accountBalance);
        }
    }
    void displayAccount(){
        System.out.println("Account Holder: "+accountHolderName);
        System.out.println("Balance: Rs."+accountBalance);
    }
}
public class Practicum7{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Account Holder Name: ");
        String name=sc.nextLine();
        System.out.print("Enter Account Balance: ");
        double balance=sc.nextDouble();
        Account account=new Account(name,balance);
        account.displayAccount();
        String choice;
        do{
            System.out.print("Enter Withdrawal Amount: ");
            try{
                double amount=sc.nextDouble();
                account.withdraw(amount);
            }catch(InsufficientBalanceException e){
                System.out.println(e.getMessage());
            }catch(InputMismatchException e){
                System.out.println("Invalid Input Type");
                sc.nextLine();
            }
            System.out.print("Do you want to make another withdrawal? ");
            choice=sc.next();
        }while(choice.equalsIgnoreCase("yes"));
    }
}