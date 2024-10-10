package src.br.com.oop.vehicle;

public class Car implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("The car is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("The car is braking");
    }
}
