package com.company;

public class Rectangle extends Shape
{
    //fields
    private int height;
    private int width;
    //constructors
    public Rectangle(int width, int height)
    {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }
    //methods
    @Override
    public double getArea()
    {
        int area = width * height;
        return area;
    }
    @Override
    public double getPerimeter()
    {
        int perimeter = 2 * width + 2 * height;
        return perimeter;
    }

}
