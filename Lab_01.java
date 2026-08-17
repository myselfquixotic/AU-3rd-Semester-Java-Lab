class BankAccount{
    String accountHolderName;
    long accountNumber;
    String accountType;
    double accountBalance;

    BankAccount(String name,long accNo,String type,double balance){
        accountHolderName=name;
        accountNumber=accNo;
        accountType=type;
        accountBalance=balance;
    }

    void deposit(double amount){
        if (amount>0){
            accountBalance+=amount;
            System.out.println("Deposited Amount: "+amount);
        } else{
            System.out.println("Invalid Deposit Amount");
        }
    }

    void withdraw(double amount){
        if (amount<=0){
            System.out.println("Invalid Withdrawal Amount");
        } else if (amount > accountBalance){
            System.out.println("Insufficient Balance");
        } else{
            accountBalance-=amount;
            System.out.println("Withdrawn Amount: "+amount);
        }
    }

    void balanceEnquiry(){
        System.out.println("Account Holder Name: "+accountHolderName);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Type: "+accountType);
        System.out.println("Account Balance: "+accountBalance);
    }
}
public class Lab_01{
    public static void main(String[] args){
        BankAccount account1=new BankAccount("Ravi", 1001, "Savings", 10000);

        System.out.println("-----Account Details-----");
        account1.balanceEnquiry();

        System.out.println("\n-----Deposit-----");
        account1.deposit(5000);

        System.out.println("\n-----Withdraw-----");
        account1.withdraw(3000);

        System.out.println("\n-----Balance Enquiry-----");
        account1.balanceEnquiry();

        System.out.println("\n-----Withdraw Equal to Balance-----");
        BankAccount account2=new BankAccount("Ravi",1001,"Savings",12000);
        account2.withdraw(12000);
        account2.balanceEnquiry();

        System.out.println("\n-----Withdraw Greater than Balance-----");
        BankAccount account3=new BankAccount("Ravi",1001,"Savings",10000);
        account3.withdraw(15000);

        System.out.println("\n-----Invalid Deposits-----");
        account1.deposit(0);
        account1.deposit(-500);

        System.out.println("\n-----Invalid Withdrawal-----");
        account1.withdraw(0);
    }
}
