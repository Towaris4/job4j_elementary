package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = array.length - 1;
        int j = 0;
        while (j < i) {
            int sum = array[j] + array[i];
            if (sum == target) {
                return new int[]{j, i};
            } else if (sum < target) {
                j++;
            } else {
                i--;
            }
        }
        return new int[0];
    }
}