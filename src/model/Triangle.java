/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lenovo
 */
public class Triangle {
    private Point d1, d2, d3;

    public Triangle(Point d1, Point d2, Point d3) {
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public double getPerimeter() {
        Segment s1 = new Segment(d1, d2);
        Segment s2 = new Segment(d2, d3);
        Segment s3 = new Segment(d3, d1);
        return s1.getLength() + s2.getLength() + s3.getLength();
    }

    public void printTriangle() {
        d1.printXY();
        System.out.print(" - ");
        d2.printXY();
        System.out.print(" - ");
        d3.printXY();
    }
}

