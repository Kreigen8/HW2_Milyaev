package lesson6;

import lesson6.Animals.Animal;
import lesson6.Animals.Cat;
import lesson6.Animals.Dog;

public class Main {

    public static void main(String[] args) {
        Animal cat= new Cat("Barsik",  200) {};
        Animal dog= new Dog("Sharik",   500, 10) {};
        Animal dog2= new Dog("Bobik",   400, 5) {};
        ((Dog) dog).swim();
        cat.run();

    }
}