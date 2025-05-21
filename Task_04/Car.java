public class Car {
    String owner;
    String brand;
    String serialNumber;
    boolean isRunning;
    double fuelLevel;

    public Car(String owner, String brand, String serialNumber, double fuelLevel) {
        this.owner = owner;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.fuelLevel = fuelLevel;
        this.isRunning = false;
    }

    public void start() {
        if (fuelLevel > 0) {
            isRunning = true;
            System.out.println("Car started.");
        } else {
            System.out.println("Cannot start. Fuel tank is empty.");
        }
    }

    public void stop() {
        isRunning = false;
        System.out.println("Car stopped.");
    }

    public void checkFuel() {
        System.out.println("Fuel Level: " + fuelLevel + " liters");
    }

    public static void main(String[] args) {
        Car car = new Car("Alice", "Toyota", "SN12345", 10.5);
        car.checkFuel();
        car.start();
        car.stop();
    }
}
