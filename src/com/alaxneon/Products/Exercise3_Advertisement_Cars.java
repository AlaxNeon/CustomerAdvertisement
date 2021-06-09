package com.alaxneon.Products;

public class Exercise3_Advertisement_Cars {

    public static void main(String[] args) {
        carsAdvertisement();
    }

    public static void carsAdvertisement() {
        Cars carOne = new Cars(
                "Mahindra",
                "Scorpio",
                "scorpio 2.0",
                "White",
                5,
                "150km/h",
                true,
                false,
                "5,00,000");
        Cars carTwo = new Cars(
                "Lamborghini",
                "Lamborghini 10.g.10v",
                "lambo max",
                "Gold",
                2,
                "250km/h",
                true,
                true,
                "90,00,000");
        Cars carThree = new Cars(
                "TATA",
                "Nano",
                "nano lx",
                "Yellow",
                5,
                "120km/h",
                false,
                false,
                "3,00,000");

        System.out.println("Car 1");
        System.out.println("Car Brand: " + carOne.brand);
        System.out.println("Car Name: " + carOne.name);
        System.out.println("Car Model: " + carOne.model);
        System.out.println("Car Colour: " + carOne.colour);
        System.out.println("No.of Seats in Car: " + carOne.numberOfSeats);
        System.out.println("Maximum Speed of the Car: " + carOne.maxSpeed);
        System.out.println("Does the Car have Bluetooth Connectivity?");
        System.out.println( carOne.bluetoothConnectivity);
        System.out.println("Car Price: Only " + carOne.price + "Rs.");
        System.out.println();

        System.out.println("Car 2");
        System.out.println("Car Brand: " + carTwo.brand);
        System.out.println("Car Name: " + carTwo.name);
        System.out.println("Car Model: " + carTwo.model);
        System.out.println("Car Colour: " + carTwo.colour);
        System.out.println("No.of Seats in Car: " + carTwo.numberOfSeats);
        System.out.println("Maximum Speed of the Car: " + carTwo.maxSpeed);
        System.out.println("Does the Car have Bluetooth Connectivity?");
        System.out.println( carTwo.bluetoothConnectivity);
        System.out.println("Does the Car have AI?");
        System.out.println(carTwo.ai);
        System.out.println("Car Price: Only " + carTwo.price + "Rs.");
        System.out.println();

        System.out.println("Car 3");
        System.out.println("Car Brand: " + carThree.brand);
        System.out.println("Car Name: " + carThree.name);
        System.out.println("Car Model: " + carThree.model);
        System.out.println("Car Colour: " + carThree.colour);
        System.out.println("No.of Seats in Car: " + carThree.numberOfSeats);
        System.out.println("Maximum Speed of the Car: " + carThree.maxSpeed);
        System.out.println("Does the Car have Bluetooth Connectivity?");
        System.out.println( carThree.bluetoothConnectivity);
        System.out.println("Car Price: Only " + carThree.price + "Rs.");
        System.out.println();
    }

    static class Cars {
        String brand;
        String name;
        String model;
        String colour;
        int numberOfSeats;
        String maxSpeed;
        boolean bluetoothConnectivity;
        boolean ai;
        String price;

        Cars(String brand,
             String name,
             String model,
             String colour,
             int numberOfSeats,
             String maxSpeed,
             boolean bluetoothConnectivity,
             boolean ai,
             String price) {
            this.brand = brand;
            this.name = name;
            this.model = model;
            this.colour = colour;
            this.numberOfSeats = numberOfSeats;
            this.maxSpeed = maxSpeed;
            this.bluetoothConnectivity = bluetoothConnectivity;
            this.ai = ai;
            this.price = price;
        }
    }
}
