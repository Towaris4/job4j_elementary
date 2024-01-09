package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int left, int right, int midle) {
        return max(left, max(right, midle));
    }

    public static int max(int left, int right, int midle, int four) {
        return max(four, max(left, max(right, midle)));
    }
}
