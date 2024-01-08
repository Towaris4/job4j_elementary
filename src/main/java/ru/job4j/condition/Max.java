package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int left, int right, int midle) {
        int result = left > max(right, midle) ? left : max(right, midle);
        return result;
    }
}