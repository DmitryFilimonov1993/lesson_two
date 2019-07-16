public class Main {

    public static void main(String[] args) {

        int array[] = new int [10];

        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*6);
        }
        for (int items: array) {
            System.out.println(items);
        }

        System.out.println("Сумма массива равна " + Main.getSum(array)+"\n");

        System.out.println("Число 1 встречается " + Main.getCountNumber(array, 1) + " раз(а)");
        System.out.println("Число 2 встречается " + Main.getCountNumber(array, 2) + " раз(а)");
        System.out.println("Число 3 встречается " + Main.getCountNumber(array, 3) + " раз(а)");
        System.out.println("Число 4 встречается " + Main.getCountNumber(array, 4) + " раз(а)");
        System.out.println("Число 5 встречается " + Main.getCountNumber(array, 5) + " раз(а)");

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

    public static int getCountNumber(int[] arr, int number){

        int count = 0;
        for (int item : arr) {
            if (item == number)
                count++;
        }
        return count;
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