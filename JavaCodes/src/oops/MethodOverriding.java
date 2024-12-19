package oops;

// Base class
class Vehicle {
    // Method to calculate fuel efficiency
    public void fuelEfficiency() {
        System.out.println("Parent.");
    }
}

// Child class Car
class Car extends Vehicle {
    @Override
    public void fuelEfficiency() {
        System.out.println("Child.");
    }
}


// Main class
public class MethodOverriding {
    public static void main(String[] args) {
        // Create a Car object
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Car();

        //parent object cant be stored in child reference.
        //because parent does not have all special capabilities of child
        //Car c1 = new Vehicle();
        Car c2 = new Car();
        v1.fuelEfficiency();
        v2.fuelEfficiency();
        //c1.fuelEfficiency();
        c2.fuelEfficiency();

    }
}

