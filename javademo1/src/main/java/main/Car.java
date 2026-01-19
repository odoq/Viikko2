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

    public void setBrand(String brand) {
    this.brand = brand;
    
    }

    public void setModel(String model) {
    this.model = model;
    
    }


    public void accelerate(int accelerate) {
        if (accelerate < 0)
            System.out.println("Nopeuden täytyy olla positiivinen luku.");
        else {
            speed = speed + accelerate;
        }

    }

    public void decelerate(int decelerate) {
        if (decelerate < 0)
            System.out.println("Nopeuden täytyy olla positiivinen luku.");
        if (speed - decelerate < 0)
            speed = 0;
        else {
            speed = speed - decelerate;
        }

    }

}
