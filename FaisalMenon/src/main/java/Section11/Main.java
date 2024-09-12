package Section11;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.riding();

        vehicle = new Bike();
        vehicle.riding();

        vehicle = new Cycle();
        vehicle.riding();
    }
}
