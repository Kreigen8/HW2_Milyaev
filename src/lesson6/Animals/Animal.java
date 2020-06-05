package lesson6.Animals;

public abstract class Animal {

    String name;
    int runDistance;
    int swimDistance;

    public Animal(String name, int runDistance) {
        this.name = name;
        this.runDistance = runDistance;
    }

    public void info() {
        System.out.println(name + " Run distance: " + runDistance + " Swim distance: " + swimDistance);
    }

//    public abstract void swim(){
//        System.out.println(name + " swim " + swimDistance + "m");
//    }

    public void run() {
        System.out.println(name + " run " + runDistance + "m");
    }
}