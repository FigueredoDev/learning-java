package src.br.com.oop.vehicle;

public class Motorcycle implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("The motorcycle is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("The motorcycle is braking");
    }
}
