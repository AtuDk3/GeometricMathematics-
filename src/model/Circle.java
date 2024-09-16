/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lenovo
 */
public class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void printCircle() {
        System.out.print("Center: ");
        center.printXY();
        System.out.printf(" - Radius: %.2f", radius);
    }
}
