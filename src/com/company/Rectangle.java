package com.company;

public class Rectangle extends Shape
{
    //fields
    private int height;
    private int width;
    //constructors
    public Rectangle(int width, int height)
    {
        this.width = width;
        this.height = height;
    }
    //methods
    public double getArea(int width, int height)
    {
        int area = width * height;
        return area;
    }
    public double getPerimeter(int width, int height)
    {
        int perimeter = 2 * width + 2 * height;
        return perimeter;
    }

}
