package io.github.allmost.learning;

public enum Peanut {

    ADAM("Adam", 16),
    CAMERON("Cameron", 16);

    public String name;
    public int age;

    Peanut(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
