import java.util.ArrayList;
import java.util.List;

class Vehicle {
    String make;
    String model;

    Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }
}

class Car extends Vehicle {
    int year;
    String color;

    Car(String make, String model, int year, String color) {
        super(make, model);
        this.year = year;
        this.color = color;
    }
}

class Garage {
    List<Vehicle> vehicles;

    Garage() {
        this.vehicles = new ArrayList<>();
    }

    void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    void displayVehicles() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
                System.out.println("Make: " + car.make + ", Model: " + car.model + ", Year: " + car.year + ", Color: " + car.color);
            } else {
                System.out.println("Make: " + vehicle.make + ", Model: " + vehicle.model);
            }
        }
    }
}

public class VehicleManager {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Toyota", "Corolla");
        Car car1 = new Car("Honda", "Civic", 2018, "Red");
        Car car2 = new Car("Ford", "Mustang", 2020, "Blue");
        Car car3 = new Car("Tesla", "Model S", 2021, "White");

        Garage garage = new Garage();
        garage.addVehicle(vehicle1);
        garage.addVehicle(car1);
        garage.addVehicle(car2);
        garage.addVehicle(car3);
        
        garage.displayVehicles();
    }
}
