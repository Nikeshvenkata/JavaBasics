package Section8;

import lombok.Data;

@Data
class Car{
    private String model;
    private String color;
    private int seats;

    public Car(String model, String color, int seats) {
        this.model = model;
        this.color = color;
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Car{" + "model='" + model + '\'' + ", color='" + color + '\'' + ", seats=" + seats + '}';
    }
}

public class ClassesAndObjects {
    public static void main(String[] args) {
        Car Maruthi = new Car("NEXA", "Blue", 5);
        Car MG = new Car("Hector", "Red", 7);
        System.out.println(Maruthi + " " + MG);
    }
}
