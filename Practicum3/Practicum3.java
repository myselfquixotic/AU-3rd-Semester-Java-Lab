package Practicum3;
abstract class Vehicle{
    String vehicleNumber;
    String brand;
    Vehicle(String number,String name){
        vehicleNumber=number;
        brand=name;
    }
    abstract void startEngine();
    final void showVehicleIdentity(){
        if(vehicleNumber.equals("")){
            System.out.println("Invalid Vehicle Number");
        }else if(brand.equals("")){
            System.out.println("Invalid Brand Name");
        }else{
            System.out.println("Vehicle Number: "+vehicleNumber);
            System.out.println("Brand: "+brand);
        }
    }
}
class Car extends Vehicle{
    Car(String number,String name){
        super(number,name);
    }
    void startEngine(){
        System.out.println("Car engine starts with key ignition");
    }
}
class Bike extends Vehicle{
    Bike(String number,String name){
        super(number,name);
    }
    void startEngine(){
        System.out.println("Bike engine starts with self-start");
    }
}
public class Practicum3{
    public static void main(String[] args){
        Car car1=new Car("KA01AB1234","Toyota");
        car1.showVehicleIdentity();
        System.out.println();
        Bike bike1=new Bike("KA05XY5678","Honda");
        bike1.showVehicleIdentity();
        System.out.println();
        car1.startEngine();
        bike1.startEngine();
        System.out.println();
        Car car2=new Car("KA09CD9876","Hyundai");
        car2.showVehicleIdentity();
        System.out.println();
        Car car3=new Car("","Toyota");
        car3.showVehicleIdentity();
        System.out.println();
        Bike bike2=new Bike("KA10EF1111","");
        bike2.showVehicleIdentity();
    }
}