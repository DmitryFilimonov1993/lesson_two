import java.util.Arrays;

public class Main {


    // Максимальное значение числа вхождения в массив
    public final static int MAX_VALUE = 5;

    public static void main(String[] args) {

        int array[] = new int [10];

        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*5 + 1);
        }
        for (int items: array) {
            System.out.println(items);
        }

        int[] temp = new int [MAX_VALUE + 1];
        for (int i = 0; i < array.length; i++){
            temp[array[i]] ++;
        }


        System.out.println("Сумма массива равна " + Main.getSum(array)+"\n");

        System.out.println("Число 1 встречается " + temp[1] + " раз(а)");
        System.out.println("Число 2 встречается " + temp[2] + " раз(а)");
        System.out.println("Число 3 встречается " + temp[3] + " раз(а)");
        System.out.println("Число 4 встречается " + temp[4] + " раз(а)");
        System.out.println("Число 5 встречается " + temp[5] + " раз(а)");

        char[] array_two = new char[12];

        for(int i = 0; i < array_two.length; i++){
            array_two[i] = (char) ((int)(65 + Math.random()*58));
        }
        for (char items: array_two) {
            System.out.println(items);
        }
        int array_three[] = new int [10];

        for(int i = 0; i < array_three.length; i++){
            array_three[i] = (int)(Math.random()*10);
        }

        for (int items: array_three) {
            System.out.println(items);
        }
        System.out.println("Сумма чётных чисел в массиве равна " + Main.getSumEven(array_three));
        System.out.println("Сумма нечётных чисел в массиве равна " + Main.getSumOdd(array_three));
    }

    public static int getSum(int[] arr){

        int sum = 0;
        for (int item : arr) {
            sum += item;
        }
        return sum;
    }

    public static int getSumOdd(int[] arr){

        int sum = 0;
        for (int item : arr) {
            if (item % 2 != 0)
                sum += item;
        }
        return sum;
    }

    public static int getSumEven(int[] arr){

        int sum = 0;
        for (int item : arr) {
            if (item % 2 == 0)
                sum += item;
        }
        return sum;
    }
}