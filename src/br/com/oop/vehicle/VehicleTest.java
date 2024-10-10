package src.br.com.oop.vehicle;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.accelerate();

        Vehicle motorcycle = new Motorcycle();
        motorcycle.brake();
    }
}
