/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lenovo
 */
public class Quadrilateral {
    private Point d1, d2, d3, d4;

    public Quadrilateral(Point d1, Point d2, Point d3, Point d4) {
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.d4 = d4;
    }

    public double getPerimeter() {
        Segment s1 = new Segment(d1, d2);
        Segment s2 = new Segment(d2, d3);
        Segment s3 = new Segment(d3, d4);
        Segment s4 = new Segment(d4, d1);
        return s1.getLength() + s2.getLength() + s3.getLength() + s4.getLength();
    }

    public void printQuadrilateral() {
        d1.printXY();
        System.out.print(" - ");
        d2.printXY();
        System.out.print(" - ");
        d3.printXY();
        System.out.print(" - ");
        d4.printXY();
    }
}

