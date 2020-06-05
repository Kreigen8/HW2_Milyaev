package lesson6;

import lesson6.Animals.Animal;
import lesson6.Animals.Cat;
import lesson6.Animals.Dog;

public class Main {

    public static void main(String[] args) {
        Animal cat= new Cat("Barsik", "red", 3, 200) { };
        Animal dog= new Dog("Sharik", "black", 4, 500, 10) {};
        Animal dog2= new Dog("Bobik", "white", 2, 400, 5) {};
        cat.run();
        dog.run();
        dog2.run();
    }
}
