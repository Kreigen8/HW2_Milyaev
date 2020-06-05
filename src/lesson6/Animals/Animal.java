package lesson6.Animals;

public abstract class Animal {

     String name;
     String color;
     int age;
     int runDistance;

    public Animal(String name, String color, int age, int runDistance) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.runDistance = runDistance;
    }

    public void info() {
        System.out.println(name + " " + color + " " + age);
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void run() {
        System.out.println(name + " run " + runDistance + "m");
    }
}
