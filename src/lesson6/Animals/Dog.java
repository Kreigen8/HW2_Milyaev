package lesson6.Animals;

public abstract class Dog extends Animal {
    int swimDistance;

    public Dog(String name, String color, int age, int runDistance, int swimDistance) {
        super(name, color, age, runDistance);
        this.swimDistance = swimDistance;
    }

    public void swim(){
        System.out.println(name + " swim " + swimDistance + "m");
    }
}
