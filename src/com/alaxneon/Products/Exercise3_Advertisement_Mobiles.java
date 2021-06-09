package com.alaxneon.Products;

public class Exercise3_Advertisement_Mobiles {

    public static void main(String[] args) {
        MobilesAdvertisement();
    }

    public static void MobilesAdvertisement() {
        Mobiles mobileOne = new Mobiles(
                "Apple",
                "Iphone pro11",
                "Gold",
                "5G",
                "Alexa",
                "50,000");
        Mobiles mobileThree = new Mobiles(
                "Samsung",
                "10.r.02v",
                "Red",
                "4G",
                "Cortana",
                "19,000");
        Mobiles mobileTwo = new Mobiles(
                "Redmi",
                "MI Y2",
                "White",
                "4G",
                "Ok Google",
                "10,000");
        Mobiles mobileFour = new Mobiles(
                "Nokia",
                "2.0.5v",
                "Black",
                "2G",
                "No AI",
                "3,000");

        System.out.println("Mobile 1");
        System.out.println("Mobile Brand: " + mobileOne.brand);
        System.out.println("Mobile Model: " + mobileOne.model);
        System.out.println("Mobile Colour: " + mobileOne.colour);
        System.out.println("Mobile Network:" + mobileOne.network);
        System.out.println("In build AI in mobile: " + mobileOne.ai);
        System.out.println("Mobile Price: Only " + mobileOne.price + "Rs.");
        System.out.println();

        System.out.println("Mobile 2");
        System.out.println("Mobile Brand: " + mobileTwo.brand);
        System.out.println("Mobile Model: " + mobileTwo.model);
        System.out.println("Mobile Colour: " + mobileTwo.colour);
        System.out.println("Mobile Network:" + mobileTwo.network);
        System.out.println("In build AI in mobile: " + mobileTwo.ai);
        System.out.println("Mobile Price: Only " + mobileTwo.price + "Rs.");
        System.out.println();

        System.out.println("Mobile 3");
        System.out.println("Mobile Brand: " + mobileThree.brand);
        System.out.println("Mobile Model: " + mobileThree.model);
        System.out.println("Mobile Colour: " + mobileThree.colour);
        System.out.println("Mobile Network:" + mobileThree.network);
        System.out.println("In build AI in mobile: " + mobileThree.ai);
        System.out.println("Mobile Price: Only " + mobileThree.price + "Rs.");
        System.out.println();

        System.out.println("Mobile 4");
        System.out.println("Mobile Brand: " + mobileFour.brand);
        System.out.println("Mobile Model: " + mobileFour.model);
        System.out.println("Mobile Colour: " + mobileFour.colour);
        System.out.println("Mobile Network:" + mobileFour.network);
        System.out.println("In build AI in mobile: " + mobileFour.ai);
        System.out.println("Mobile Price: Only " + mobileFour.price + "Rs.");
        System.out.println();
    }

    static class Mobiles {
        String brand;
        String model;
        String colour;
        String network;
        String ai;
        String price;

        Mobiles(String brand,
             String model,
             String colour,
             String network,
             String ai,
             String price) {
            this.brand = brand;
            this.model = model;
            this.colour = colour;
            this.network = network;
            this.ai = ai;
            this.price = price;
        }
    }
}
