package lesson3;

import java.util.Random;
import java.util.Scanner;

public class HW3 {
    static Random random = new Random();
    static Scanner sc;

    public static void main(String[] args) {
        int a=1;
        while (a==1){
            System.out.println("Компьютер загадал число от 0 до 9. Угадайте с трёх попыток");
            guessNumber();
            a=0;
            System.out.println("Для продолжения введите 1, для выхода 0");
                a = sc.nextInt();
        }
    }

    public static void guessNumber() {
        int i, n, a, j;
        a = random.nextInt(10); //загаданное число
  //      System.out.println(a);
        i = j = 3;
        for (; i > 0; i--) {
            sc = new Scanner(System.in);
            n = sc.nextInt();
            if (n > a) {
                System.out.println("Загаданное число меньше");
                j--;
            } else {
                if (n < a) {
                    System.out.println("Загаданное число больше");
                    j--;
                } else {
                    System.out.println("Вы угадали");
                    return;
                }
            }
        }
        if (j==0){
            System.out.println("Вы проиграли");
        }
        System.out.println("Хотите повторить?");
    }
}
