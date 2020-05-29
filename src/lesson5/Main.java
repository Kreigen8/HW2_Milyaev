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
    }
}
