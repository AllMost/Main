package io.github.allmost.learning;

public class Main {
    public static void main(String[] args) {


         /*
            & = AND
            | = OR
            < = LESS THEN
            > = GREATER THAN
            >= = GREATER THAN OR EQUAL TO
            <= = LESS THAN OR EQUAL TO
            % = MEDIAN
            ++<var>
            --<var>
            <var>++
            <var>--
       */

        int num = 1;
        final String name = "Adam is gay";
        double version = 1.0;
        int balance = 1;
        float x = 1f;
        float y = 10f;
        float z = 100f;
        char c = 'A';
        boolean isOnline = true;

        if (version == 1.0 && isOnline == true) {
            System.out.println(name + " | " + version);
            System.out.println(Peanut.ADAM.getName());
            System.out.println(Peanut.ADAM.getAge());
            System.out.println(Peanut.CAMERON.getName());
            System.out.println(Peanut.CAMERON.getAge());

        } else {
            System.out.println("you're gay");
        }

        while (balance < 11) {
            System.out.println(balance);
            balance++;

        }

        /*
            x = starting ammount
            y = max ammount
            x = ammount going up by
         */

        for (int i = 1; i < 101; i++) {
            System.out.println(balance);
            balance++;
        }


    }
}


