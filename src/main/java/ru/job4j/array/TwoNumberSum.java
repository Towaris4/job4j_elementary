package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = array.length - 1;
        int j = 0;
        while (j != i) {
            if (array[i] + array[j] != target) {
                i--;
            } else {
                return new int[]{j, i};
            }
            if (i == j) {
                j++;
                i = array.length - 1;
            }
        }
        return new int[0];
    }
}