package main;

public class Car {
    String brand;
    String model;
    int speed;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.speed = 0;
    }

    public void status() {
        System.out.println("Auto: " + brand + " " + model + ", Nopeus: " + speed + "km/h");
        

    }
}
