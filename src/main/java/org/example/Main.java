package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

public static void main(String[] args) {
//Test for Vehicle class
Vehicle vec = new Vehicle(4, "Red", 4.0f, "Gas");
System.out.println("The vehicle is made of " + vec.getNumberOfWheels() + " wheels");
vec.setNumberOfWheels(3);
System.out.println("The number of wheels is now " + vec.getNumberOfWheels());
System.out.println("The vehicle's color is " + vec.getColor());
vec.setColor("Yellow");
System.out.println("The color is now changed to " + vec.getColor());
System.out.println("The engine's size is " + vec.getEngineSize());
vec.setEngineSize(1.8f);
System.out.println("The engine size is now changed to " + vec.getEngineSize());
System.out.println("The fuel type is " + vec.getFuelType());
vec.setFuelType("Diesel");
System.out.println("The fuel type is now changed to " + vec.getFuelType());

//Test for Car class
Car car = new Car(4, "Green", 2.0f, "Gas", "Toyota");
car.honk();
car.displayInfo();
car.setNumberOfWheels(4);
car.setColor("Blue");
car.setEngineSize(3.0f);
car.setFuelType("Electric");
car.setBrand("Tesla");
System.out.println("\nChanges:");
car.displayInfo();
}
}