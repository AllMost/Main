package io.github.allmost.learning;

import java.util.Scanner;

public class Health {

    public static void main(String[] args) {

        int health = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println(health);


        for (int i = 1; i <= 10; i++) {
            health += 10;
            System.out.println(health);
        }

        while (true) {
            if (health < 0 || health == 0) {
                System.out.println("Game Over");
                break;
            }
        }

        while (true) {
            if (health > 100 || health == 101) {
                health = 100;
                System.out.println(health);
                break;
            }
        }


    }
}
