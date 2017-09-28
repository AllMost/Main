package io.github.allmost.learning;

public class Challenges {
    public static void main(String[] args) {

        double firstNumber = 20;
        double secondNumber = 80;
        double myTotal = firstNumber + secondNumber * 25;
        double theRemainder = myTotal % 40;
        if (theRemainder <= 20) {
            System.out.println("Total was over the limit");
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("Testing");

    }
}
