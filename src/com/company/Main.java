package com.company;

//import javafx.scene.shape.Circle;

public class Main {

    public static void main(String[] args) {
	    Shape shape1 = new Rectangle(5, 4);
	    Shape shape2 = new Circle(5);
	    System.out.println(shape1);
	    System.out.println("My perimeter is: " + shape1.getPerimeter());
	    System.out.println("My area is: " + shape1.getArea());
        System.out.println(shape2);
        System.out.println("My perimeter is: " + shape2.getPerimeter());
        System.out.println("My area is: " + shape2.getArea());
    }
}
