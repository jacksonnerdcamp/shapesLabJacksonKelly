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
        double area = (Math.PI*radius*radius);
        return area;
    }
    @Override
    public double getPerimeter()
    {
        double perimeter = (Math.PI*2*radius);
        return perimeter;
    }
}
