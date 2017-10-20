package io.github.allmost.learning;


import java.util.Scanner;

public class Challenges{
    public static void main(String[] args) {

        double temperatureInFarenheit = 86;
        double temperatureInCelcius1 = temperatureInFarenheit-32/1.8;
        double temperatureInCelcius2 = temperatureInCelcius1/1.8;

        System.out.println(temperatureInCelcius2);


        String hello = "Hello";
        String name = "Raj";
        int age = 29;
        double weight = 74.5;

        System.out.println(hello+ ", my name is " + name +". I am " + age + " years old and I weigh "+weight);


        int distanceInMiles = 12;
        double distanceInKm = distanceInMiles/1.6;
        System.out.println(distanceInKm);
        int convertedDistanceInKm = (int) (distanceInKm );

        System.out.println(convertedDistanceInKm);

        if (convertedDistanceInKm <2){
            System.out.println("Walk");
        }else if(convertedDistanceInKm <=6 && 2<6){
            System.out.println("Bicycle");
        }else if(convertedDistanceInKm>6){
            System.out.println("Bus");
        }

        Scanner userInput = new Scanner(System.in);
        System.out.print("How many feet are you tall: ");
        final int feet = userInput.nextInt();
        System.out.print("and how many inches: ");
        final int inches = userInput.nextInt();
        System.out.print("What is your weight in stones: ");
        final int stone = userInput.nextInt();
        System.out.print("and how many pounds: ");
        final int pounds = userInput.nextInt();

        final double oneFootInCentimeters = 30.5;
        final double oneInchInCentimeters = 2.54;
        final double oneStoneInKilograms = 6.35;
        final double onePoundInKilograms = 0.45;

        double feetInCm = feet * oneFootInCentimeters;
        double inchesInCm = inches * oneInchInCentimeters;
        double exactHeight = feetInCm+inchesInCm;
        int roundedHeight = (int) exactHeight;

        double stoneInKg = stone * oneStoneInKilograms;
        double poundsInKg = pounds * onePoundInKilograms;
        double weightInKg = stoneInKg + poundsInKg;
        double roundedWeightInKg = Math.round(weightInKg *10)/10.0;

        System.out.println("Height: " + roundedHeight + " cm");
        System.out.println("Weight: " + roundedWeightInKg + " kg");





    }
}
