package bank.loans;
public class Loan{
    String loanNumber;
    String loanType;
    double loanAmount;
    public Loan(String number,String type,double amount){
        loanNumber=number;
        loanType=type;
        loanAmount=amount;
    }
    public void displayLoan(){
        System.out.println("Loan Number: "+loanNumber);
        System.out.println("Loan Type: "+loanType);
        System.out.println("Loan Amount: Rs."+loanAmount);
    }
}