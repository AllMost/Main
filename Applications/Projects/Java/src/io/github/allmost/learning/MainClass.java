package io.github.allmost.learning;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = in.nextInt();

        System.out.print("Input second number: ");
        int num2 = in.nextInt();

        System.out.println(num1 + " x " + num2 + " = " + num1 * num2);

        int result = 0;
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                result += 10;
            } else {
                result += i;
            }
        }
        System.out.println(result);

        int[] arr = new int[5];

        arr[0] = 1;
        arr[1] = 5;
        System.out.println(arr[0] - arr[1]);

        int[] myArr = {6, 42, 3, 7};
        int sum = 0;
        for (int x = 0; x < myArr.length; x++) {
            sum += myArr[x];
        }
        System.out.println(sum);

    }
}
