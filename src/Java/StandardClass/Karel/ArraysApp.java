package Java.StandardClass.Karel;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {

        int[] numbers = { 2,4,1,6,8,21,90,12,55,33 };

        Arrays.sort(numbers);

        System.out.println("\nIni adalah Arrays.toString()");
        System.out.println(Arrays.toString(numbers));

        System.out.println("\nIni adalah Arrays.binarySearch");
        System.out.println(Arrays.binarySearch(numbers, 21));
        System.out.println(Arrays.binarySearch(numbers, 4));
        System.out.println(Arrays.binarySearch(numbers, 33));
        System.out.println(Arrays.binarySearch(numbers, 100));

        System.out.println("\nIni adalah Arrays.copyOf()");
        int[] result = Arrays.copyOf(numbers, 4);
        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOf(numbers, 2);
        System.out.println(Arrays.toString(result2));

        System.out.println("\nIni adalah Arrays.copyOfRange()");
        int[] result3 = Arrays.copyOfRange(numbers, 3, 7);
        System.out.println(Arrays.toString(result3));

    }
}
