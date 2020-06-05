package lesson6.Animals;

public abstract class Dog extends Animal {
    int swimDistance;

    public Dog(String name, int runDistance, int swimDistance) {
        super(name, runDistance);
        this.swimDistance = swimDistance;
    }

    public void swim(){
        System.out.println(name + " swim " + swimDistance + "m");
    }
}