import java.util.Arrays;
import java.util.Random;

public class MainClass {
    static Random random;

    public static void main(String[] args) {
        array();
        array2();
        array3();
        array2D();
        array5();
//        array6();
//        array7();
    }

    //    1. Задать целочисленный массив, состоящий из элементов 0 и 1.
//    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void array() {
        System.out.println("Задание № 1");
        random = new Random();
        int n = 5;
        int i;
        int[] arr = new int[n];
        for (i = 0; i < n; i++) {
            arr[i] = random.nextInt(2);
        }
        System.out.println("Сгенерированный массив: ");
        System.out.printf(Arrays.toString(arr) + "\n");
        for (i = 0; i < n; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println("Измененный массив: ");
        System.out.printf(Arrays.toString(arr) + "\n");
    }


//  2. Задать пустой целочисленный массив размером 8.
//    С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

    public static void array2() {
        System.out.println("Задание № 2");
        int i, j;
        j = 0;
        int[] arr = new int[8];
        for (i = 0; i < 8; i++) {
            arr[i] = j;
            j += 3;
        }
        System.out.println("Массив с шагом 3: ");
        System.out.printf(Arrays.toString(arr) + "\n");
    }

//  3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

    public static void array3() {
        System.out.println("Задание № 3");
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Массив: \n" + Arrays.toString(arr));
        int i = 0;
        for (i = 0; i < 12; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println("Измененный массив: ");
        System.out.printf(Arrays.toString(arr) + "\n");
    }

//  4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//    и с помощью цикла(-ов) заполнить его диагональные элементы единицами;


    public static void array2D() {
        System.out.println("Задание № 4");
        int i, j;
        int n = 9;
        int[][] table = new int[n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == j) {
                    table[i][j] = 1;
                }
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i + j == n - 1) {
                    table[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(table[i]));
        }

    }

//  5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);

    public static void array5() {
        System.out.println("Задание № 5");
        random = new Random();
        int n = 6;
        int[] arr = new int[n];
        int a, b, i;
        for (i = 0; i < n; i++) {
            arr[i] = random.nextInt(100);
        }
        a=arr[1];
        b=arr[1];
        System.out.println("Массив: \n" + Arrays.toString(arr));
        for (i = 0; i < n; i++) {
            if (a > arr[i]) {
                a = arr[i];
            }
        }
        for (i = 0; i < n; i++) {
            if (b < arr[i]) {
                b = arr[i];
            }
        }
        System.out.println("Минимальное значение: " + a);
        System.out.println("Максимальное значение: " + b);
    }

//  6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
//    метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
//        Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
//    граница показана символами ||, эти символы в массив не входят.

//    public static void array6() {
//        System.out.println("Задание № 6");
//    }

//            7. **** Написать метод, которому на вход подается одномерный массив и число n
//            (может быть положительным, или отрицательным), при этом метод должен сместить все
//    элементы массива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.

//        public static void array7() {
//            System.out.println("Задание № 7");
//            int a, b, i;
//            b=5;
//            random = new Random();
//            int[] arr = new int[b];
//            for (i = 0; i < b; i++) {
//                arr[i] = random.nextInt(30);
//            }
//            int n=1;
//            System.out.printf(Arrays.toString(arr) + "\n");
//            for (i = 0; i < b; i++){
//                    arr[i]=arr[i+n];
//            }
//            System.out.println(Arrays.toString(arr));
//
//
//        }
}
