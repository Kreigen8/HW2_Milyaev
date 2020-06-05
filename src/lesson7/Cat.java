package lesson7;

public class Cat {
    private String name;
    private int hunger;

    public Cat(String name, int hunger) {
        this.name = name;
        this.hunger = hunger;
    }

    public String getName() {
        return name;
    }

    public int getHunger() {
        System.out.println(name + " Satiety: " + hunger);
        return hunger;
    }

    public int maxSatiety = 15;

    public void eat(Plate plate) {
        System.out.println(name + " eat...");
        if (hunger < maxSatiety){
            plate.decreaseFood(maxSatiety);
            hunger = hunger + maxSatiety;
        } else {
            System.out.println(name + ": I don't want to eat");
        }

    }



}
