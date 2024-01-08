
package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private int x;

    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(2, 0);
        Point b = new Point(0, 0);
        Point c = new Point(-1, 0);
        Point d = new Point(-3, 0);
        double result = b.distance(a);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = c.distance(a);
        System.out.println("result (-1, 0) to (2, 0) " + result);
        result = d.distance(a);
        System.out.println("result (-3, 0) to (2, 0) " + result);
    }
}
