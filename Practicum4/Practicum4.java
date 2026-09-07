package Practicum4;
class Payment{
    void makePayment(double amount){
        if(amount<=0){
            System.out.println("Invalid Payment Amount");
        }else{
            System.out.println("Payment Amount: Rs."+amount);
        }
    }
    void makePayment(double amount,String transactionId){
        if(amount<=0){
            System.out.println("Invalid Payment Amount");
        }else if(transactionId.equals("")){
            System.out.println("Empty Transaction ID");
        }else if(transactionId.length()<4||!transactionId.startsWith("TXN")){
            System.out.println("Invalid Transaction ID");
        }else{
            System.out.println("Payment Amount: Rs."+amount);
            System.out.println("Transaction ID: "+transactionId);
        }
    }
}
class CreditCardPayment extends Payment{
    void makePayment(double amount){
        if(amount<=0){
            System.out.println("Invalid Payment Amount");
        }else{
            System.out.println("Credit Card Payment: Rs."+amount);
        }
    }
}
class UPIPayment extends Payment{
    void makePayment(double amount){
        if(amount<=0){
            System.out.println("Invalid Payment Amount");
        }else{
            System.out.println("UPI Payment: Rs."+amount);
        }
    }
}
class NetBankingPayment extends Payment{
    void makePayment(double amount){
        if(amount<=0){
            System.out.println("Invalid Payment Amount");
        }else{
            System.out.println("Net Banking Payment: Rs."+amount);
        }
    }
}
public class Practicum4{
    public static void main(String[] args){
        Payment payment=new CreditCardPayment();
        payment.makePayment(5000.00);
        System.out.println();
        payment=new UPIPayment();
        payment.makePayment(1200.50);
        System.out.println();
        payment=new NetBankingPayment();
        payment.makePayment(8500.00);
        System.out.println();
        payment=new CreditCardPayment();
        payment.makePayment(2500.00,"TXN1001");
        System.out.println();
        payment=new CreditCardPayment();
        payment.makePayment(-1000.00);
        System.out.println();
        payment=new UPIPayment();
        payment.makePayment(0.00);
        System.out.println();
        payment=new CreditCardPayment();
        payment.makePayment(3000.00,"");
        System.out.println();
        payment=new CreditCardPayment();
        payment.makePayment(4500.00,"123");
    }
}