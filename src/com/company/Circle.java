package com.company;
public class Circle extends Shape {

    ///fields///
    private int radius;

    ///constructors///
    public Circle(int radius)
    {
        this.radius = radius;
    }

    ///methods///
    public double getArea()
    {
        double area = (3.14*radius*radius);
        return area;
    }

    public double getPerimeter()
    {
        double perimeter = (3.14*2*radius);
        return perimeter;
    }
}
