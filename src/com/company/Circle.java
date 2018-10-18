package com.company;
public class Circle extends Shape {

    ///fields///
    private int radius;

    ///constructors///
    public Circle(int radius)
    {
        super("Circle");
        this.radius = radius;
    }

    ///methods///
    @Override
    public double getArea()
    {
        double area = (3.14*radius*radius);
        return area;
    }
    @Override
    public double getPerimeter()
    {
        double perimeter = (3.14*2*radius);
        return perimeter;
    }
}
