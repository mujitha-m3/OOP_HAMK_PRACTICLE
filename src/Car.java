import java.util.Scanner;

public class Car {
    private String brand;
    private String model;
    private int amountOfFuel;

    public Car() {
        this.brand = "";
        this.model = "";
        this.amountOfFuel = 0;
        printData();
    }

    public Car(String brand, String model, int amountOfFuel) {
        this.brand = brand;
        this.model = model;
        this.amountOfFuel = amountOfFuel;
        printData();
    }

    public void brake() {
        System.out.println("Car is breaking");
        displayMsg();
    }

    public void accelerate() {
        if (amountOfFuel > 0) {
            amountOfFuel--;
            System.out.println("Car is accelerating");
            displayMsg();
        }
    }

    public void refuel(int amount) {
        int currentFuel = amountOfFuel;
        this.amountOfFuel += amount;
        System.out.println("Fuel in the tank: " + currentFuel);
        System.out.println("Refuel: " + amount);
        System.out.println("Fuel in the tank after the refuel: " + amountOfFuel);
    }

    private void printData() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Fuel: " + amountOfFuel);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void displayMsg() {
        System.out.println("a=accelerate b=break x=exit");
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "RAV4", 40);
        car.displayMsg();
        Scanner scanner = new Scanner(System.in);
        String letter;

        do {
            
            letter = scanner.nextLine();

            switch (letter) {
                case "a":
                    car.accelerate();
                    break;
                case "b":
                    car.brake();
                    break;
                default:
            }
        } while (!letter.equals("x"));

        scanner.close();
    }
}
