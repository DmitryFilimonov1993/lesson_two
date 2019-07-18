import java.util.Arrays;

public class Main {

    public final static int ARRAY_SIZE = 10;
    public final static int MAX_VALUE = 10;
    public final static int MIN_VALUE = 1;

    public static void main(String[] args) {

        int array[] = new int [ARRAY_SIZE];

        for(int i = 0; i < array.length; i++){
            array[i] = MIN_VALUE + (int)(Math.random()*(MAX_VALUE - MIN_VALUE + 1));
        }
        for (int items: array) {
            System.out.println(items);
        }

        int[] temp = new int [MAX_VALUE - MIN_VALUE + 1];
        for (int i = 0 ; i < array.length; i++){
            temp[array[i] - MIN_VALUE] ++;
        }

        System.out.println("Сумма массива равна " + Main.getSum(array)+"\n");

        for(int i = 0; i < temp.length; i++){
            if (temp[i] == 0) continue;
            System.out.println("Число " + (i + MIN_VALUE) + " встречается " + temp[i] + " раз(а)");

        }

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