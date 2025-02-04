# Java-assignment-on-classes-group-A
# Java Program: Concrete Class, Abstract Class, and Interface

## Overview
This Java program demonstrates the implementation of a Concrete Class, an Abstract Class, and an Interface using cars.

## Classes
- `Vehicle` (Interface): Defines abstract methods `startEngine` and `stopEngine`.
- `Car` (Abstract Class): Implements `Vehicle` and provides an implementation for `honk`. It includes an abstract method `fuelUp`.
- `SportsCar` (Concrete Class): Extends `Car`, providing implementations for `startEngine`, `stopEngine`, and `fuelUp`.

## Usage
```java
public class Main {
    public static void main(String[] args) {
        Car mySportsCar = new SportsCar();
        mySportsCar.startEngine();
        mySportsCar.honk();
        mySportsCar.fuelUp();
        mySportsCar.stopEngine();
    }
}
