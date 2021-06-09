package com.alaxneon;

import com.alaxneon.Products.Exercise3_Advertisement_Cars;
import com.alaxneon.Products.Exercise3_Advertisement_Lens;
import com.alaxneon.Products.Exercise3_Advertisement_Mobiles;

import java.util.Scanner;

public class CustomerAdvertisement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello, may I know your name?");
        String userName = input.nextLine();

        if (userName.endsWith("i") || userName.endsWith("a")) {
            System.out.println("Hello Miss." + userName + ",");
            System.out.println("Madam, are you interested in buying some products?");
            String interestedYorN = input.nextLine();
            if (interestedYorN.startsWith("N") || interestedYorN.startsWith("n")) {
                System.out.println("Ok Miss, Nice to meet you");
            } else if (interestedYorN.startsWith("Y") || interestedYorN.startsWith("y")) {
                System.out.println("Miss, We have Cars, Camera Lens and Mobiles in stock.");
                System.out.println("What will you like to buy Miss?");
                String item = input.nextLine();
                if (item.startsWith("Car")) {
                    System.out.println("This is the list of cars we have Miss:");
                    Exercise3_Advertisement_Cars.carsAdvertisement();
                    System.out.println();
                    System.out.println("What will you like to buy Miss?");
                    String itemIntrest = input.nextLine();

                    if (itemIntrest.startsWith("N")) {
                        System.out.println("Ok miss, nice to meet you");
                    } else if (itemIntrest.contains("costly")) {
                        System.out.println("Sorry miss, we can't do anything.");
                        System.out.println("You can contact us again my pressing Shift + F10 on your keyboard");
                    } else {
                        System.out.println("Thank You for purchasing a " + itemIntrest + ".");
                        System.out.println("You can contact us again my pressing Shift + F10 on your keyboard");
                    }
                } else if (item.startsWith("Mobile")) {
                    System.out.println("This is the list of mobiles we have Miss:");
                    Exercise3_Advertisement_Mobiles.MobilesAdvertisement();
                    System.out.println("What will you like to buy Miss?");
                    String itemIntrest = input.nextLine();

                    if (itemIntrest.startsWith("N")) {
                        System.out.println("Ok miss, nice to meet you");
                    } else if (itemIntrest.contains("costly")) {
                        System.out.println("Sorry miss, we can't do anything.");
                        System.out.println("You can contact us again my pressing Shift + F10 on your keyboard");
                    } else {
                        System.out.println("Thank You for purchasing a " + itemIntrest + ".");
                        System.out.println("You can contact us again my pressing Shift + F10 on your keyboard");
                    }
                } else if (item.startsWith("Camera") || item.startsWith("Lens")) {
                    System.out.println("This is the list of Lens we have Miss");
                    Exercise3_Advertisement_Lens.lensAdvertisement();
                    System.out.println();
                    System.out.println("What will you like to buy Miss?");
                    String itemIntrest = input.nextLine();

                    if (itemIntrest.startsWith("N")) {
                        System.out.println("Ok miss, nice to meet you");
                    } else if (itemIntrest.contains("costly")) {
                        System.out.println("Sorry miss, we can't do anything.");
                        System.out.println("You can contact us again my pressing Shift + F10 on your keyboard");
                    } else {
                        System.out.println("Thank You for purchasing a " + itemIntrest + ".");
                        System.out.println("You can contact us again my pressing Shift + F10 on your keyboard");
                    }
                } else if (item.endsWith("s")) {
                    System.out.println("Sorry Miss, we don't have it. We will try to have it next time.");
                } else if (item.startsWith("N") || item.startsWith("S")) {
                    System.out.println("Sorry, We could not satisfy you");
                } else if (item.endsWith("all") || item.endsWith("All")) {
                    System.out.println("CARS:");
                    Exercise3_Advertisement_Cars.carsAdvertisement();
                    System.out.println();

                    System.out.println("MOBILES:");
                    Exercise3_Advertisement_Mobiles.MobilesAdvertisement();
                    System.out.println();

                    System.out.println("CAMERA LENS");
                    Exercise3_Advertisement_Lens.lensAdvertisement();
                    System.out.println();
                    System.out.println("What will you like to buy Miss?");
                    String itemIntrest = input.nextLine();

                    if (itemIntrest.startsWith("N")) {
                        System.out.println("Ok miss, nice to meet you");
                    } else if (itemIntrest.contains("costly")) {
                        System.out.println("Sorry miss, we can't do anything.");
                        System.out.println("You can contact us again my pressing Shift + F10 on your keyboard");
                    } else {
                        System.out.println("Thank You for purchasing a " + itemIntrest + ".");
                        System.out.println("You can contact us again my pressing Shift + F10 on your keyboard");
                    }
                }
            }
        } else {
            System.out.println("Hello Mr." + userName + ",");
            System.out.println("Sir, are you interested in buying some products?");
            String interestedYorN = input.nextLine();
            if (interestedYorN.startsWith("N") || interestedYorN.startsWith("n")) {
                System.out.println("Ok Sir, Nice to meet you");
            } else if (interestedYorN.startsWith("Y") || interestedYorN.startsWith("y")) {
                System.out.println("Sir, We have Cars, Camera Lens and Mobiles in stock.");
                System.out.println("What will you like to buy Sir?");
                String item = input.nextLine();
                if (item.startsWith("Car")) {
                    System.out.println("This is the list of cars we have Sir:");
                    Exercise3_Advertisement_Cars.carsAdvertisement();
                    System.out.println();
                    System.out.println("What will you like to buy Sir?");
                    String itemIntrest = input.nextLine();

                    if (itemIntrest.startsWith("N")) {
                        System.out.println("Ok sir, nice to meet you");
                    } else if (itemIntrest.contains("costly")) {
                        System.out.println("Sorry sir, we can't do anything.");
                        System.out.println("You can contact us again my pressing Shift + F10 on your keyboard");
                    } else {
                        System.out.println("Thank You for purchasing a " + itemIntrest + ".");
                        System.out.println("You can contact us again my pressing Shift + F10 on your keyboard");
                    }
                } else if (item.startsWith("Mobile")) {
                    System.out.println("This is the list of mobiles we have Sir:");
                    Exercise3_Advertisement_Mobiles.MobilesAdvertisement();
                    System.out.println("What will you like to buy Sir?");
                    String itemIntrest = input.nextLine();

                    if (itemIntrest.startsWith("N")) {
                        System.out.println("Ok sir, nice to meet you");
                    } else if (itemIntrest.contains("costly")) {
                        System.out.println("Sorry sir, we can't do anything.");
                        System.out.println("You can contact us again my pressing Shift + F10 on your keyboard");
                    } else {
                        System.out.println("Thank You for purchasing a " + itemIntrest + ".");
                        System.out.println("You can contact us again my pressing Shift + F10 on your keyboard");
                    }
                } else if (item.startsWith("Camera") || item.startsWith("Lens")) {
                    System.out.println("This is the list of Lens we have Sir");
                    Exercise3_Advertisement_Lens.lensAdvertisement();
                    System.out.println();
                    System.out.println("What will you like to buy Sir?");
                    String itemIntrest = input.nextLine();

                    if (itemIntrest.startsWith("N")) {
                        System.out.println("Ok sir, nice to meet you");
                    } else if (itemIntrest.contains("costly")) {
                        System.out.println("Sorry sir, we can't do anything.");
                        System.out.println("You can contact us again my pressing Shift + F10 on your keyboard");
                    } else {
                        System.out.println("Thank You for purchasing a " + itemIntrest + ".");
                        System.out.println("You can contact us again my pressing Shift + F10 on your keyboard");
                    }
                } else if (item.endsWith("s")) {
                    System.out.println("Sorry Sir, we don't have it. We will try to have it next time.");
                } else if (item.startsWith("N") || item.startsWith("S")) {
                    System.out.println("Sorry, We could not satisfy you");
                } else if (item.endsWith("all") || item.endsWith("All")) {
                    System.out.println("CARS:");
                    Exercise3_Advertisement_Cars.carsAdvertisement();
                    System.out.println();

                    System.out.println("MOBILES:");
                    Exercise3_Advertisement_Mobiles.MobilesAdvertisement();
                    System.out.println();

                    System.out.println("CAMERA LENS");
                    Exercise3_Advertisement_Lens.lensAdvertisement();
                    System.out.println();
                    System.out.println("What will you like to buy Sir?");
                    String itemIntrest = input.nextLine();

                    if (itemIntrest.startsWith("N")) {
                        System.out.println("Ok sir, nice to meet you");
                    } else if (itemIntrest.contains("costly")) {
                        System.out.println("Sorry sir, we can't do anything.");
                        System.out.println("You can contact us again my pressing Shift + F10 on your keyboard");
                    } else {
                        System.out.println("Thank You for purchasing a " + itemIntrest + ".");
                        System.out.println("You can contact us again my pressing Shift + F10 on your keyboard");

                    }
                }
            }
        }
    }
}