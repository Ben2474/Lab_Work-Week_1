package org.example;

public class Car extends Vehicle{

//Attribute
String brand;

//Constructor
public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
super(numberOfWheels,color,engineSize,fuelType);
this.brand = brand;
}

//Getter and Setter for Brand
public String getBrand() {return brand;}
public void setBrand(String brand){this.brand = brand;}

//Honk method
public void honk () {
System.out.println("\nHonk,honk!");
}

//DisplayInfo method
public void displayInfo() {
System.out.println("\nCar Info:");
System.out.println("The number of wheels is " + getNumberOfWheels());
System.out.println("The color is " + getColor());
System.out.println("The size of the engine is " + getEngineSize());
System.out.println("The fuel type is " + getFuelType());
System.out.println("The car brand is " + getBrand());
}
}

