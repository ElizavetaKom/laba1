package ru.mirea.lab1;

public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Liki", 2);
        Dog d2 = new Dog("Koko", 7);
        Dog d3 = new Dog("Klava");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
