package com.alaxneon.Products;

public class Exercise3_Advertisement_Lens {

    public static void main(String[] args) {
        lensAdvertisement();
    }

    public static void lensAdvertisement(){
        // Classes and Objects
        Lens lensOne = new Lens(
                "apple",
                "85mm",
                true,
                "white",
                59_999);
        Lens lensTwo = new Lens(
                "sony",
                "30mm",
                true,
                "black",
                25_999);

        System.out.println("Lens 1");
        System.out.println("The Brand of Lens1 is " + lensOne.brand);
        System.out.println("The Focal Length of Lens1 is " + lensOne.focalLength);
        System.out.println("The Lens1 is Prime: " + lensOne.isPrime);
        System.out.println("The Colour of Lens 1 is " + lensOne.colour);
        System.out.println("The Price of Lens 1 is only " + lensOne.price + "Rs.");
        System.out.println();

        System.out.println("Lens 2");
        System.out.println("The Brand of Lens2 is " + lensTwo.brand);
        System.out.println("The Focal Length of Lens2 is " + lensTwo.focalLength);
        System.out.println("The Lens2 is Prime: " + lensTwo.isPrime);
        System.out.println("The Colour of Lens 2 is " + lensTwo.colour);
        System.out.println("The Price of Lens 2 is only " + lensTwo.price + "Rs.");
        System.out.println();

    }


    static class Lens {
        String brand;
        String focalLength;
        boolean isPrime;
        String colour;
        int price;

        Lens(String brand,
             String focalLength,
             boolean isPrime,
             String colour,
             int price) {
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
            this.colour = colour;
            this.price = price;
        }
    }


}

