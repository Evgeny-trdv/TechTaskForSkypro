package org.example;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{2, 1, 2, 2, 4, 4, 4, 8};

        System.out.println(Arrays.toString(changeArray(array)));
        System.out.println(Arrays.toString(changeArrayTwo(array)));
        System.out.println(Arrays.toString(changeArrayThird(array)));

    }

    public static int[] changeArray(int[] array) {
        int[] newArray = IntStream.range(0, array.length)
                .map(i -> array[i] % 2 == 0 ? ++array[i] : array[i])
                .skip(2)
                .limit(5)
                .toArray();
        return newArray;
    }

    public static int[] changeArrayTwo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i]++;
            }
        }
        return Arrays.copyOfRange(array, 2, 7);
    }

    public static int[] changeArrayThird(int[] array) {
        int[] newArray = Arrays.stream(array).map(j -> j % 2 == 0 ? j + 1 : j)
                .skip(2)
                .limit(5)
                .toArray();
        return newArray;
    }
}