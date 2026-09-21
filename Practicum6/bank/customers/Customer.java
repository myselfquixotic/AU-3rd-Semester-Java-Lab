package bank.customers;
public class Customer{
    String customerId;
    String customerName;
    String contactNumber;
    public Customer(String id,String name,String contact){
        customerId=id;
        customerName=name;
        contactNumber=contact;
    }
    public void displayCustomer(){
        System.out.println("Customer ID: "+customerId);
        System.out.println("Customer Name: "+customerName);
        System.out.println("Contact Number: "+contactNumber);
    }
}