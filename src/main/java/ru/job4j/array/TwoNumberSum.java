package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 1;
        int j = 0;
        while (j < array.length - 1) {
            if (array[i] + array[j] != target) {
                i++;
            } else {
                return new int[]{j, i};
            }
            if (i >= array.length - 1) {
                j++;
                i = j + 1;
            }
        }
        return new int[0];
    }
}