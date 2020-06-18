package lesson7;

public class Main {
    public static void main(String[] args) {

        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Barsik", 0);
        cat[1] = new Cat("Tigr", 0);
        cat[2] = new Cat("Murzik", 0);
        Plate plate = new Plate(40);
        plate.info();
        for (int i = 0; i < cat.length; i++) {
            System.out.println();
            cat[i].getHunger();
            cat[i].eat(plate);
            cat[i].getHunger();
            plate.info();

            if (plate.getFood()<cat[i].maxSatiety){
                plate.addFood(10);
                System.out.println("Food on a plate: " + plate.getFood());
                System.out.println();
            }
        }


    }
}
