package com.qianyan.bean;

/**
 * Created with Intellij IDEA.
 * <p>Created by rainchen
 * User: rainchen
 * Date: 14-11-10
 * Time: 下午8:46.
 */
public class Point {

    private int xcoor;
    private int ycoor;

    public int getXcoor() {
        return xcoor;
    }

    public void setXcoor(int xcoor) {
        this.xcoor = xcoor;
    }

    public int getYcoor() {
        return ycoor;
    }

    public void setYcoor(int ycoor) {
        this.ycoor = ycoor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;

        Point point = (Point) o;

        if (xcoor != point.xcoor) return false;
        if (ycoor != point.ycoor) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = xcoor;
        result = 31 * result + ycoor;
        return result;
    }

    @Override
    public String toString() {
        return "Point{" +
                "xcoor=" + xcoor +
                ", ycoor=" + ycoor +
                '}';
    }
}
