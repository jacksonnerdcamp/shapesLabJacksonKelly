package com.company;

public class Circle {

    ///fields///
    private int radius;

    ///constructors///
    public Circle(int radius)
    {
        this.radius = radius;
    }

    ///methods///
    public int getArea(int radius)
    {
        int area = (int) (3.14*radius*radius);
        return area;
    }

    public int getPerimeter(int radius)
    {
        int perimeter = (int) (3.14*2*radius);
        return perimeter;
    }
}
