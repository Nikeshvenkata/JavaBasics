package Section9;

abstract class Car{
    int doors; int tyres;
    String color;
    abstract void accelerate();
    abstract void applyBrake();
}

class Ferrri extends Car{
    void accelerate(){
        System.out.println("Ferrri accelerate");
    }
    void applyBrake(){
        System.out.println("Ferrri applyBrake");
    }
}

 class Audi extends Car{
     void accelerate(){
         System.out.println("Audi accelerate");
     }
     void applyBrake(){
         System.out.println("Audi applyBrake");
     }
 }

 class CarRepair{
    void repairCar(Car car){
        System.out.println("Repairing Car");
        car.accelerate();
        car.applyBrake();
    }
 }

public class AbstractExampleMain {
    public static void main(String[] args) {
        Car car1 = new Ferrri();
        car1.color = "Red"; car1.doors = 2; car1.tyres = 4;
        CarRepair carRepair1 = new CarRepair();
        carRepair1.repairCar(car1);
        System.out.println();

        Car car2 = new Audi();
        car2.color = "Blue"; car2.doors = 4; car2.tyres = 5;
        CarRepair carRepair2 = new CarRepair();
        carRepair2.repairCar(car2);
    }
}
