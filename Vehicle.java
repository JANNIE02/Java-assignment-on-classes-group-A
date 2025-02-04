public interface Vehicle {
    // Define the Vehicle interface

        void startEngine(); // Abstract method, must be implemented by classes
        void stopEngine(); // Abstract method, must be implemented by classes
    }

    // Define the abstract class Car that implements Vehicle
    abstract class Car implements Vehicle {
        // Concrete method
        public void honk() {
            System.out.println("Car is honking");
        }

        // Abstract method
        public abstract void fuelUp();
    }

    // Define the concrete class SportsCar that extends Car
    class SportsCar extends Car {
        @Override
        public void startEngine() {
            System.out.println("SportsCar engine starts with a roar");
        }

        @Override
        public void stopEngine() {
            System.out.println("SportsCar engine stops smoothly.");
        }

        @Override
        public void fuelUp() {
            System.out.println("SportsCar is fueling up with  fuel.");
        }
    }


