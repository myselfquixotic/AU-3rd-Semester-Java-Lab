import bank.customers.Customer;
import bank.loans.Loan;
import bank.accounts.Account;
public class Practicum6{
    public static void main(String[] args){
        Customer customer=new Customer("C101","Rahul","9876543210");
        customer.displayCustomer();
        System.out.println();
        Loan loan=new Loan("L201","Home Loan",500000);
        loan.displayLoan();
        System.out.println();
        Account account=new Account("A301","Savings",0);
        account.deposit(10000);
        System.out.println();
        Account account2=new Account("A302","Savings",20000);
        account2.withdraw(5000);
        account2.displayBalance();
        System.out.println();
        Account account3=new Account("A303","Savings",5000);
        account3.withdraw(8000);
        System.out.println();
        account2.deposit(-2000);
    }
}