package bank.accounts;
public class Account{
    String accountNumber;
    String accountType;
    double balance;
    public Account(String number,String type,double amount){
        accountNumber=number;
        accountType=type;
        balance=amount;
    }
    public void deposit(double amount){
        if(amount<0){
            System.out.println("Invalid Deposit Amount");
        }else{
            balance+=amount;
            System.out.println("Deposit: Rs."+amount);
            System.out.println("Updated Balance: Rs."+balance);
        }
    }
    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("Insufficient Balance");
        }else if(amount<0){
            System.out.println("Invalid Withdrawal Amount");
        }else{
            balance-=amount;
            System.out.println("Withdrawal: Rs."+amount);
            System.out.println("Updated Balance: Rs."+balance);
        }
    }
    public void displayBalance(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Type: "+accountType);
        System.out.println("Balance: Rs."+balance);
    }
}