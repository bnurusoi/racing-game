package org.example;

public class App
{
    public static void main( String[] args )
    {
   System.out.println("Hello World!");

        Car carReference = new Car();
        carReference.name = "Ferrari";
        carReference.maxSpeed = 300;
        carReference.fuelLevel = 60;
        carReference.mileage = 12.5;
        carReference.totalTraveledDistance = 0;
        carReference.damaged = true;
        carReference.doorCount = 1;
        carReference.color = "Red";

        Engine engine1 = new Engine();
          engine1.manufacturer= "Ferarri";
        engine1.capacity = 3000;

        carReference.engine = engine1;

         System.out.printf("Engine1 capacity: " + engine1.capacity);
         System.out.printf("Car engine capacity after update: " + carReference.engine.capacity);

         engine1.capacity = 5000;
         System.out.printf("Car engine capacity: " + carReference.engine.capacity);

        System.out.println("Properties of car" + carReference.name);
        System.out.println("Max speed: " + carReference.maxSpeed);
        System.out.println("Fuel level: " + carReference.fuelLevel);
        System.out.println("Mileage: " + carReference.mileage);
        System.out.println("Total Traveled Distance: " + carReference.totalTraveledDistance);
        System.out.println("Damaged: "+ carReference.damaged);
        System.out.println("Door Count: " + carReference.doorCount);
        System.out.println("Color: " + carReference.color);
        System.out.println(carReference);


        Car car2 = new Car();
        car2.name = "Renault";
        car2.maxSpeed = 200;
        car2.fuelLevel = 70;
        car2.mileage = 12.5;
        car2.totalTraveledDistance = 100;
        car2.damaged = true;
        car2.doorCount = 1;
        car2.color = "Red";

        System.out.println("Properties of car" + car2.name);
        System.out.println("Max speed: " + car2.maxSpeed);
        System.out.println("Fuel level: " + car2.fuelLevel);
        System.out.println("Mileage: " + car2.mileage);
        System.out.println("Total Traveled Distance: " + car2.totalTraveledDistance);
        System.out.println("Damaged: "+ car2.damaged);
        System.out.println("Door Count: " + car2.doorCount);
        System.out.println("Color: " + car2.color);
        System.out.println(carReference);
    }
}
