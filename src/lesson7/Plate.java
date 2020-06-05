package lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int amount){
        if (food >= amount){
            food -= amount;
        } else {
            System.out.println("Not enough food");
        }
    }

    public void info(){
        System.out.println("Plate: "+ food);
    }

    public void addFood(int food) {
        this.food = this.food + food;
        System.out.println("Add food: " + food);
    }
}
