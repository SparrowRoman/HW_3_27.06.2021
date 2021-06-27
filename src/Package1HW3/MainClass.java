package Package1HW3;

import java.util.Arrays;
import java.util.Random;

public class MainClass {

    static Random random = new Random();

    public static void main(String[] args) {


        int[][] arr = new int[5][5];
        arr[0][0] = 1;
        arr[1][1] = 1;
        arr[2][2] = 1;
        arr[3][3] = 1;
        arr[4][4] = 1;

        printArr2D(arr);

        /**
         * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
         * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
         * С помощью цикла и условия заменить 0 на 1, 1 на 0;*/
        int[] taskOne = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < taskOne.length; i++) {
            if (taskOne[i] > 0) {
                System.out.print(taskOne[i] * 0 + "  ");
            } else {
                System.out.print(taskOne[i] + 1 + "  ");
            }
        }
        System.out.println();

/**
 * 2. Задать пустой целочисленный массив длиной 100.
 *  С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
 * */
        int[] taskTwo = new int[100];
        for (int i = 0; i < taskTwo.length; i++) {
            taskTwo[i] = 1 + i;
            System.out.print(taskTwo[i] + "  ");
        }


        /**
         * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
         * пройти по нему циклом, и числа меньшие 6 умножить на 2;
         * */
        int[] taskThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(taskThree));
        for (int i = 0; i < taskThree.length; i++) {
            if (taskThree[i] < 6) {
                taskThree[i] = taskThree[i] * 2;
            }
        }
        System.out.println(Arrays.toString(taskThree));


    }




    /**
     * Создать квадратный двумерный
     * целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы
     * единицами (можно только одну из диагоналей, если обе сложно).
     * Определить элементы одной из диагоналей можно по следующему
     * принципу: индексы таких элементов равны, то есть [0][0],
     * [1][1], [2][2], …, [n][n];
     */
    public static void printArr2D(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%5d", arr[i][j]);
            }
            System.out.println();
        }
    }

}




