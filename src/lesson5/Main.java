package lesson5;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Person[] persArray = new Person[10];
        persArray[0] = new Person("Ivan", "Boss", "bossIvan@mail.ru", 1234567, 100500, 45);
        persArray[1] = new Person("Petr", "Deputy Boss", "petr@mail.ru", 1234589, 85000, 40);
        persArray[2] = new Person("Masha", "Admin", "admin@mail.ru", 1235758, 35000, 60);
        persArray[3] = new Person("Vasya", "Programmer", "vasya@mail.ru", 1234984, 65000, 60);
        persArray[4] = new Person("Kolya", "Programmer", "kolya@mail.ru", 1239643, 60000, 28);
        persArray[5] = new Person("Zhenya", "Programmer", "zhenya@mail.ru", 1233846, 70500, 37);
        persArray[6] = new Person("Olya", "Engineer", "olya@mail.ru", 1239637, 100500, 47);
        persArray[7] = new Person("Fedya", "Manager", "fedya@mail.ru", 1239521, 100500, 30);
        persArray[8] = new Person("Natasha", "Accountant", "natasha@mail.ru", 1232432, 100500, 40);
        persArray[9] = new Person("Tolya", "Cleaner", "Tolya@mail.ru", 1236525, 100500, 63);


        for (int i=0; i < persArray.length; i++){
            if (persArray[i].getAge() >= 40){
                persArray[i].info();
            }
        }


//        Cat[] cats = new Cat[3];
//        cats[0] = new Cat("Barsik", "red", 3);
//        cats[1] = new Cat("Tigr", "red black", 2);
//        cats[2] = new Cat("Murzik", "white", 5);
//
////        for (int i = 0; i < cats.length; i++) {
////            cats[i].info();
////            cats[i].jump();
////        }
//
//        infoForAllCats(cats);


//        Cat[] cats = {
//                new Cat("Barsik", "red", 3),
//                new Cat("Tigr", "red black", 2),
//                new Cat("Murzik", "white", 5),
//                new Cat("Pantera", "black", 8),
//        };
//
//        infoForAllCats(cats);


//        int x = Integer.parseInt("456");

//        int a = 0x10;
//        System.out.println(a);

//        int max = Integer.MAX_VALUE;
//        int min = Integer.MIN_VALUE;
//        System.out.printf("max = %d \nmin = %d\n", max, min);
//
////        System.out.println(fourFormatNum(12));
//
////        System.out.println(Integer.toHexString(12));
//        System.out.println("Math.abs(min)"+ Math.abs(min));


//        String s = String.format("num %d String %s float %.2f", 4, "java", 6.9);
//        System.out.println(s);
//
//        s = String.valueOf(67);
//        s = ""+67;

//        String s = "java core";
//
////        System.out.println(s.endsWith("re"));
////        System.out.println(s.subSequence(2,6));
////        System.out.println(s.equals("jAva core"));
////        System.out.println(s.equalsIgnoreCase("jAva core"));
////        System.out.println(s.compareTo("s"));
//
//        String str ="12-03-2006 ttr 7-45-31 tyy";
////        String[] strings = str.split("\\s");
//        String[] strings = str.split("\\D+");
//        System.out.println(Arrays.toString(strings));

//        System.out.println(getNum());

    }

    public static int getNum() {
        do {
            try {
                System.out.println("input number");
                String x = sc.nextLine();
                return Integer.parseInt(x);
            } catch (Exception e) {
                System.out.println("not number...");
            }
        } while (true);
    }

    public static String fourFormatNum(int x) {
        StringBuilder sb = new StringBuilder("" + x);
        while (sb.length() < 4) {
            sb.insert(0, "0");
        }
        return sb.toString();
    }


    public static void infoForAllCats(Person[] people) {
        for (int i = 0; i < people.length; i++) {
            people[i].info();
        }
    }


}
