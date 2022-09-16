package com.csc205.project1;

/* Point implementation
 *  @author Nathan Wilson
 *  @Version 1.1
 */

public class Point {
    public double x;
    public double y;

    public Point() {

    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point b) {
        return Math.sqrt(Math.pow((b.x - x), 2) + Math.pow((b.y - y), 2));
    }

    public double getX() {
        return x;

    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    public double shiftX(double x) {
        this.x += x;
        return this.x;
    }
    public double shiftY(double y) {
        this.y += y;
        return this.y;
    }

    public void setPoint(double x, double y) {
    }

    public void rotate(double theta) {
        double x1 = this.x;
        double y1 = this.y;
        x = (x1 * Math.cos(theta)) - (y1 * Math.sin(theta));
        y = (x1 * Math.sin(theta)) + (y1 * Math.cos(theta));

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Point{");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}

