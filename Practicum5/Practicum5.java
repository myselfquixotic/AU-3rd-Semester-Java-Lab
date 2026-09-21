package Practicum5;
interface SmartDevice{
    void turnOn();
    void turnOff();
}
class SmartFan implements SmartDevice{
    public void turnOn(){
        System.out.println("Smart Fan is turned ON");
    }
    public void turnOff(){
        System.out.println("Smart Fan is turned OFF");
    }
}
class SmartLight implements SmartDevice{
    public void turnOn(){
        System.out.println("Smart Light is turned ON");
    }
    public void turnOff(){
        System.out.println("Smart Light is turned OFF");
    }
}
class SmartAC implements SmartDevice{
    public void turnOn(){
        System.out.println("Smart AC is turned ON");
    }
    public void turnOff(){
        System.out.println("Smart AC is turned OFF");
    }
}
public class Practicum5{
    public static void main(String[] args){
        SmartDevice device = new SmartFan(); 
        device.turnOn();
        device.turnOff();
        System.out.println();
        device=new SmartLight();
        device.turnOn();
        device.turnOff();
        System.out.println();
        device=new SmartAC();
        device.turnOn();
        device.turnOff();
    }
}